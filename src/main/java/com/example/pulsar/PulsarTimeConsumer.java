package com.example.pulsar;

import jakarta.annotation.PreDestroy;
import org.apache.pulsar.client.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.apache.pulsar.client.api.Schema.STRING;

@Component
public class PulsarTimeConsumer {

    Logger log = LoggerFactory.getLogger(PulsarApplication.class);

    private final Consumer<String> timeConsumer;

    public PulsarTimeConsumer(@Autowired PulsarClient pulsarClient) throws PulsarClientException {
        timeConsumer = initializeTimeConsumer(pulsarClient);
    }

    @PreDestroy
    void preDestroy() throws PulsarClientException {
        timeConsumer.close();
    }

    private Consumer<String> initializeTimeConsumer(PulsarClient pulsarClient) throws PulsarClientException {
        return pulsarClient.newConsumer(STRING)
                .topic("times")
                .subscriptionName("time-subscription")
//                .subscriptionInitialPosition(SubscriptionInitialPosition.Earliest)
                .messageListener((consumer, message) -> {
                    try {
                        log.info(message.getValue());
                        consumer.acknowledge(message);
                    } catch (Exception e) {
                        log.error("Failed to acknowledge", e);
                    }
                })
                .subscribe();
    }

}
