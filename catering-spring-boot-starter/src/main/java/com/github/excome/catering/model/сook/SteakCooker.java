package com.github.excome.catering.model.сook;

import com.github.excome.catering.model.meal.Meal;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SteakCooker implements Cooker {
    @Override
    public Meal cookMeal(int number) {
        log.info("Готовлю стейк Рибай {}", number);
        return new Meal("Рибай %s".formatted(number));
    }
}
