package com.github.excome.corporate_party_app.controller;

import com.github.excome.catering.model.meal.Meal;
import com.github.excome.catering.service.CateringService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;


@Slf4j
@RestController
@RequiredArgsConstructor
public class PartyController {
    private final CateringService cateringService;

    @GetMapping("/api/v1/food")
    public List<Set<Meal>> getMeals() {
        var food = cateringService.giveOutFood();
        log.info("Еда приготовлена: {}",food);
        return food;
    }
}
