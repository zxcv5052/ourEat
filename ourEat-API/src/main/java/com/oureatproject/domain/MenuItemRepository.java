package com.oureatproject.domain;

import java.util.List;

public interface MenuItemRepository {
    public List<MenuItem> findByRestaurantId(Long id);
}
