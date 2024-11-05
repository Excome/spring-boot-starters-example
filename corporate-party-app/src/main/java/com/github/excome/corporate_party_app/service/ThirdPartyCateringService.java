package com.github.excome.corporate_party_app.service;

import com.github.excome.catering.model.meal.Meal;
import com.github.excome.catering.service.CateringService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

//@Component
public class ThirdPartyCateringService implements CateringService {
    @Override
    public List<Set<Meal>> giveOutFood() {
        return List.of(Set.of(new Meal("Объедки")));
    }
}
