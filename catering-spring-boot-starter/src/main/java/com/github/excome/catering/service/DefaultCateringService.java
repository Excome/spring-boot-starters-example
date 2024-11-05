package com.github.excome.catering.service;

import com.github.excome.catering.model.meal.Meal;
import com.github.excome.catering.model.сook.Cooker;
import com.github.excome.catering.properties.CateringProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
@RequiredArgsConstructor
public class DefaultCateringService implements CateringService{
    private final CateringProperties properties;
    private final List<Cooker> cookers;

    public List<Set<Meal>> giveOutFood() {
        if (cookers.isEmpty()) {
            log.info("Повара не приехали");
            return List.of();
        }

        log.info("Начинаем готовить");
        return IntStream.range(1, properties.servingsCount() + 1)
                .mapToObj(num -> cookers.stream()
                        .map(cooker -> cooker.cookMeal(num))
                        .collect(Collectors.toSet()))
                .toList();
    }
}
