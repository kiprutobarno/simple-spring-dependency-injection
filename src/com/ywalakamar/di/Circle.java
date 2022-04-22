package com.ywalakamar.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {

    Point center;

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
        System.out.println("Circle center point is (" + center.getX() + ", " + center.getY() + ")");

    }

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

}
