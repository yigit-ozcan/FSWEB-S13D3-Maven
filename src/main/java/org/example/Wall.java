package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double a) {
        width = (a < 0) ? 0 : a;
    }

    public void setHeight(double a) {
        height = (a < 0) ? 0 : a;
    }

    public double getArea() {
        return width * height;
    }
}
