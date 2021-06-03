package com.example.spring.zerotohero.utils;

import com.example.spring.zerotohero.model.Ingredient;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class TacosUtil {

    public static List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
        List<Ingredient> filteredIngredients= ingredients.stream().filter(f->f.getType()==type).collect(Collectors.toList());
        log.info("filtered ingredients: "+ Arrays.toString(filteredIngredients.toArray()));
        return filteredIngredients;
    }
}
