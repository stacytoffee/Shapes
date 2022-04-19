package com.company;

import java.util.ArrayList;

public class FigureCreator implements ICreator {
    @Override
    public Figure create(ArrayList<Point> list) {
        int nPoints = list.size();
        ICreator creator;

        if (nPoints ==2){
            creator = new CircleCreator();
        } else if (nPoints == 3){
            creator = new TriangleCreator();
        } else if (nPoints == 4){
            creator = new RectangleCreator();
        } else if (nPoints >4){
            creator = new PolygonCreator();
        }else return null;
        return creator.create(list);
    }
}
