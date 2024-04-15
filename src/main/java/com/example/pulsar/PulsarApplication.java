package com.example.pulsar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.pulsar.annotation.EnablePulsar;
import org.springframework.pulsar.core.DefaultSchemaResolver;
import org.springframework.pulsar.core.SchemaResolver.SchemaResolverCustomizer;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.apache.pulsar.client.api.Schema.AVRO;

@SpringBootApplication
@EnableScheduling
@EnablePulsar
public class PulsarApplication {

    public static void main(String[] args) {
        SpringApplication.run(PulsarApplication.class, args);
    }

    @Bean
    public SchemaResolverCustomizer<DefaultSchemaResolver> schemaResolverCustomizer() {
        return (schemaResolver) -> schemaResolver.addCustomSchemaMapping(User.class, AVRO(User.class));
    }

}
