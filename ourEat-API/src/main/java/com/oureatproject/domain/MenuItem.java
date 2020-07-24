package com.oureatproject.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class MenuItem {

    @Id
    private Long id;

    private Long restaurantId;
    private String name;
}
