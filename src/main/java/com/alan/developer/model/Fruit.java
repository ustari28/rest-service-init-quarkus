package com.alan.developer.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Fruit {

    public String type;
    public Float price;z

    public Fruit() {
    }

    public Fruit(String type, Float price) {
        this.type = type;
        this.price = price;
    }
}
