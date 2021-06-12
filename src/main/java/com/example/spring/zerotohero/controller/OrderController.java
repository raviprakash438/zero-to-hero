package com.example.spring.zerotohero.controller;

import com.example.spring.zerotohero.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(Model model){
        model.addAttribute("addOrder", new Order());
        return "orderForm";
    }
}
