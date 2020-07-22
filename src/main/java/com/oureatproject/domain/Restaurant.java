package com.oureatproject.domain;

import lombok.Getter;

@Getter
public class Restaurant {
    private final String name;
    private final String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
