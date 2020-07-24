package com.oureatproject.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {
    public List<MenuItem> findByRestaurantId(Long id);
}
