package com.oureatproject.domain;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant("kyeong","kyeonggi");
    }
}