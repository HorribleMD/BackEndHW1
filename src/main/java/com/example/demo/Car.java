package com.example.demo;

import java.beans.JavaBean;

@JavaBean
public class Car {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
