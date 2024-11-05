package com.github.excome.catering.model.сook;

import com.github.excome.catering.model.meal.Meal;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SnackCooker implements Cooker {
    @Override
    public Meal cookMeal(int number) {
        log.info("Готовлю закуску Жульен {}", number);
        return new Meal("Жульен %s".formatted(number));
    }
}
