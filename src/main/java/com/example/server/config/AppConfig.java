package com.example.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${server.port}")
    private int serverPort;

    // Other configuration properties and beans

    // Getter for server port
    public int getServerPort() {
        return serverPort;
    }
}