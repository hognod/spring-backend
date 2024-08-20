package com.hognod.backend.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info into = new Info()
                .title("Swagger")
                .version("v1")
                .description("* GET, PUT");

        return new OpenAPI()
                .components(new Components())
                .info(into);
    }
}