package com.budgets.budgetingapplication.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        Contact myContact = new Contact();
        myContact.setName("Budgeting Application Backend");
        myContact.setEmail("mosesa.ochieng@gmail.com");

        Info information = new Info()
                .title("Budget App  Backend")
                .version("1.0")
                .description("This API exposes endpoints for the Budget App.")
                .contact(myContact);

        return new OpenAPI().info(information)
                ;
    }

}
