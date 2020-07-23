package com.oureatproject.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {
    List<Restaurant> list = new ArrayList<>();

    public RestaurantRepositoryImpl(){
        list.add(new Restaurant(1004L, "Bob zip", "seoul"));
        list.add(new Restaurant(2020L, "Cyber food", "seoul"));
    }

    @Override
    public List<Restaurant> findAll(){
        return list;
    }
    @Override
    public Restaurant findById(Long id){
        return  list.stream()
                .filter(r->r.getId().equals(id))
                .findFirst()
                .orElse(null);


    }
}
