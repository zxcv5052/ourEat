package com.oureatproject.domain;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "seoul");

        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("seoul"));
    }
    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "seoul");

        assertThat(restaurant.getInformation(), is("Bob zip in seoul"));
    }
}