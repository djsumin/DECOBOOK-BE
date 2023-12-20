package com.decobook.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * Swagger springdoc-ui 구성 파일
 */
//@EnableWebMvc -> springdoc 2.3.0버전일 때 활성화
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
    	
        Info info = new Info()
                .title("Decobook API Document")
                .version("v1.0.0") //처음에 0.0.1이었음 (딱히상관없을듯)
                .description("decobook");
        
        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
    
}