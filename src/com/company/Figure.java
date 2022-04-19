package com.company;

import java.util.ArrayList;

public abstract class Figure {

    public ArrayList<Point> list;

    public Figure(ArrayList<Point> arrayList) {
        this.list = arrayList; // инициализация листа значением, которое передали во входном параметре
    }

    public double getPerimeter() {
        double perimeter = 0;
        if (list.size() != 0) {
            int i = 0;
            for (i = 0; i < (list.size() - 1); i++) {
                perimeter += Math.sqrt(Math.pow((list.get(i + 1).getX() - list.get(i).getX()), 2)) + Math.sqrt(Math.pow((list.get(i + 1).getY() - list.get(i).getY()), 2));
            }
            perimeter += Math.sqrt(Math.pow((list.get(i - 1).getX() - list.get(0).getX()), 2)) + Math.sqrt(Math.pow((list.get(i - 1).getY() - list.get(0).getY()), 2));
        }
        return perimeter;
    }


    public double getArea() {
        double area = 0;
        //формула площади Гаусса
        if (list.size() != 0) {

            double summand1 = 0;

            for (int i = 0; i < list.size() -1; i++) {
                summand1 += list.get(i).getX() * list.get(i + 1).getY();
            }
            summand1 += list.get(list.size() - 1).getX() * list.get(0).getY();

            double summand2 = 0;

            for (int j = 0; j < list.size() -1; j++) {
                summand2 += list.get(j + 1).getX() * list.get(j).getY();
            }
            summand2 += list.get(0).getX() * list.get(list.size() - 1).getY();
            area = Math.abs((summand1 - summand2) / 2);

            return area;
        }
        return area;
    }


    public String toString() {
        return getClass().getSimpleName();
    }
}
