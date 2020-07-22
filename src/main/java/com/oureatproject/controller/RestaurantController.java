package com.oureatproject.controller;

import com.oureatproject.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public List<Restaurant> list(){
        List<Restaurant> list = new ArrayList<>();
        return list;
    }
}
