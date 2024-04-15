package com.example.pulsar;

import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.pulsar.core.PulsarTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PulsarUserPublisher {

    private final PulsarTemplate<User> pulsarTemplate;

    PulsarUserPublisher(@Autowired PulsarTemplate<User> pulsarTemplate) {
        this.pulsarTemplate = pulsarTemplate;
    }

    @Scheduled(fixedRate = 30000)
    private void publishMessage() throws PulsarClientException {
        pulsarTemplate.send("users", new User("will", "smith"));
    }
}
