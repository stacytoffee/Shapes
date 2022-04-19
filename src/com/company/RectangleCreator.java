package com.company;

import java.util.ArrayList;

public class RectangleCreator implements ICreator{
    @Override
    public Figure create(ArrayList<Point> list) {
        return new Rectangle(list);
    }
}
