package com.api.teste.config;
import io.swagger.oas.models.Components;
import io.swagger.oas.models.OpenAPI;
import io.swagger.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Value("http://localhost:8080")
    private String apiUrl;
    @Bean
    public OpenAPI customConfiguration() {
        return new OpenAPI()
                .components(new Components())
                .addServersItem(new Server().url(apiUrl));
    }
}
//:-)