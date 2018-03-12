package com.capgemini.bike.config;

import com.capgemini.bike.domain.Voetballer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeamConfig {


    @Bean
    public Voetballer cruijff() {

        Voetballer result = new Voetballer();
        result.setName("Johan Cruijff");

        return result;
    }

    @Bean
    public Voetballer haan() {
        Voetballer result = new Voetballer();

        result.setName("Arie Haan");

        return result;
    }
}
