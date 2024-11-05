package com.github.excome.catering.service;

import com.github.excome.catering.model.meal.Meal;

import java.util.List;
import java.util.Set;

public interface CateringService {
    List<Set<Meal>> giveOutFood();
}
