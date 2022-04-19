package com.company;

import java.util.ArrayList;

public class Circle extends Figure {


    public Circle(ArrayList<Point> list) {
        super(list);
    }

    private double getRadius() {
        Point point1 = list.get(0);
        Point point2 = list.get(1);
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));

    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius(); //можно this, можно без
    }


    @Override
    public double getArea() {
        double circleArea = Math.PI * Math.pow(getRadius(), 2);

        return super.getArea();
    }
}