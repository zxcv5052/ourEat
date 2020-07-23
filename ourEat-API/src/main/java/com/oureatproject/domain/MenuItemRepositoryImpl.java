package com.oureatproject.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository{
    List<MenuItem> menuItems = new ArrayList<>();

    public MenuItemRepositoryImpl() {
        menuItems.add(new MenuItem("Kimchi"));
    }

    @Override
    public List<MenuItem> findByRestaurantId(Long id) {
        return menuItems;
    }
}
