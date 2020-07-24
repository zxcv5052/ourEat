package com.oureatproject.domain;

import lombok.Getter;
import org.springframework.data.annotation.Persistent;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Restaurant {

    @Id
    private Long id;

    private String name;

    private String address;

}
