package com.example.spring.zerotohero.controller;

import com.example.spring.zerotohero.model.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

import com.example.spring.zerotohero.model.Ingredient.Type;
import com.example.spring.zerotohero.utils.TacosUtil;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacosController {

    @GetMapping
    public String ShowTacosForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );

        Type[] types= Ingredient.Type.values();
        for(Type type: types){
             model.addAttribute(type.toString().toLowerCase(), TacosUtil.filterByType(ingredients, type));

        }
      //  model.addAttribute("design", new T)
        return "design";


    }


}
