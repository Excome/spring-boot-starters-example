package com.github.excome.catering;

import com.github.excome.catering.model.сook.Cooker;
import com.github.excome.catering.model.сook.SaladCooker;
import com.github.excome.catering.model.сook.SnackCooker;
import com.github.excome.catering.model.сook.SteakCooker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class CookersConfiguration {
    @Bean
    @ConditionalOnProperty(value = "catering.main-meal", havingValue = "true")
    public Cooker steakCooker() {
        log.info("Повар стейков вышел на работу");
        return new SteakCooker();
    }

    @Bean
    @ConditionalOnResource(resources = "classpath:salad-ingredients.txt")
    public Cooker saladCooker() {
        log.info("Повар салатов вышел на работу");
        return new SaladCooker();
    }

    @Bean
    @ConditionalOnProperty(value = "catering.snack", havingValue = "true")
    public Cooker snackCooker() {
        log.info("Повар снэков вышел на работу");
        return new SnackCooker();
    }
}
