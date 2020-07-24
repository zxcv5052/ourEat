package com.oureatproject.service;

import com.oureatproject.domain.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

public class RestaurantServiceTest {

    private RestaurantService restaurantService;

    @Mock
    private RestaurantRepository restaurantRepository;

    @Mock
    private MenuItemRepository menuItemRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        mockMenuItemRepository();
        mockRestaurantRepository();

        restaurantService = new RestaurantService(restaurantRepository,menuItemRepository);
    }


    @Test
    public void getRestaurants(){
        List<Restaurant> restaurantList = restaurantService.getRestaurants();
        Restaurant restaurant = restaurantList.get(0);

        assertThat(restaurant.getId(), is(1004L));
    }

    private void mockMenuItemRepository() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem());
        given(menuItemRepository.findByRestaurantId(1004L)).willReturn(menuItems);
    }
    private void mockRestaurantRepository() {
        List<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant = new Restaurant();
        restaurants.add(restaurant);

        given(restaurantRepository.findAll()).willReturn(restaurants);

        given(restaurantRepository.findById(1004L)).willReturn(java.util.Optional.of(restaurant));

    }
}
