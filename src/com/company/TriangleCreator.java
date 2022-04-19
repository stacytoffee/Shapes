package com.company;

import java.util.ArrayList;

public class TriangleCreator implements ICreator {
    @Override
    public Figure create(ArrayList<Point> list) {
        return new Triangle(list);
    }
}
