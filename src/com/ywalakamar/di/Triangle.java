package com.ywalakamar.di;

import java.util.List;

public class Triangle {
    private String type;
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void draw() {
        System.out.println(getType() + " triange drawn with coordinate points: ");
        for (Point point : points) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
