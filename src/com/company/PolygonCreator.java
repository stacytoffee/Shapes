package com.company;

import java.util.ArrayList;

public class PolygonCreator implements ICreator {
    @Override
    public Figure create(ArrayList<Point> list) {
        return new Polygon(list);
    }
}
