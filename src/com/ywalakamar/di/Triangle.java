package com.ywalakamar.di;

public class Triangle {
    private String type;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointC() {
        return pointC;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void draw() {
        System.out.println(getType() + " triange drawn with coordinate points ");
        System.out.println("Point A: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B: (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C: (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    public void customInit() {
        System.out.println("Custom init method called for Triangle");
    }

    public void customDestroy() {
        System.out.println("Custom destroy method called for Triangle");
    }
}
