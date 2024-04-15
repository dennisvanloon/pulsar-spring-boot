package com.example.pulsar;

import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import static java.time.LocalDateTime.now;

@Component
public class PulsarTimePublisher {

    private final PulsarTemplate<String> pulsarTemplate;

    PulsarTimePublisher(@Autowired PulsarTemplate<String> pulsarTemplate) {
        this.pulsarTemplate = pulsarTemplate;
    }

    @Scheduled(fixedRate = 30000)
    private void publishMessage() throws PulsarClientException {
        pulsarTemplate.send("times", "Hello there, the current time is " + now());
    }
}
