package com.company;

import java.util.ArrayList;

public class CircleCreator implements ICreator{
    @Override
    public Figure create(ArrayList<Point> list) {
        return new Circle(list);
    }
}
