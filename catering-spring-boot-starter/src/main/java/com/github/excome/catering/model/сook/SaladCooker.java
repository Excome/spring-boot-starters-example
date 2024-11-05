package com.github.excome.catering.model.сook;

import com.github.excome.catering.model.meal.Meal;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SaladCooker implements Cooker {

    @Override
    public Meal cookMeal(int number) {
        log.info("Готовлю салат Цезарь {}", number);
        return new Meal("Цезарь %s".formatted(number));
    }
}
