package com.example.pulsar;

import jakarta.annotation.PreDestroy;
import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.apache.pulsar.client.api.Schema.AVRO;

@Component
public class PulsarUserConsumer {

    Logger log = LoggerFactory.getLogger(PulsarApplication.class);

    private final Consumer<User> consumer;

    public PulsarUserConsumer(@Autowired PulsarClient pulsarClient) throws PulsarClientException {
        consumer = initializeConsumer(pulsarClient);
    }

    @PreDestroy
    void preDestroy() throws PulsarClientException {
        consumer.close();
    }

    private Consumer<User> initializeConsumer(PulsarClient pulsarClient) throws PulsarClientException {
        return pulsarClient.newConsumer(AVRO(User.class))
                .topic("users")
                .subscriptionName("user-subscription")
//                .subscriptionInitialPosition(SubscriptionInitialPosition.Earliest)
                .messageListener((consumer, message) -> {
                    try {
                        log.info("We received a user with firstname {} and lastname {}", message.getValue().getFirstName(), message.getValue().getLastName());
                        consumer.acknowledge(message);
                    } catch (Exception e) {
                        log.error("Failed to acknowledge", e);
                    }
                })
                .subscribe();
    }

}
