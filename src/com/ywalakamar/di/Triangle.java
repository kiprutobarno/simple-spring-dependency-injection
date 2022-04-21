package com.ywalakamar.di;

public class Triangle {
    private String type;

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void draw() {
        System.out.println(getType() + " triange drawn");
    }
}
