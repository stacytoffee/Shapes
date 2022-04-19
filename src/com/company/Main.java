package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(2, 4);
        Point p2 = new Point(5, 4);
        Point p3 = new Point(5, 2);
        Point p4 = new Point(4, 6);


        ArrayList<Point> pointsList = new ArrayList<Point>();
        pointsList.add(p1);
        pointsList.add(p2);
        pointsList.add(p3);
        pointsList.add(p4);
//        pointsList.add(p1);
//
        FigureCreator creator = new FigureCreator();
        Figure f1 = creator.create(pointsList);
        System.out.println("Hello! I am a " + f1.toString());
        f1.getPerimeter();
        f1.getArea();
        System.out.println("My area is " + f1.getArea());
        System.out.println("My perimeter is " + f1.getPerimeter());


  //      System.out.println(pointsList);




//        AxisPoint ap1 = new AxisPoint(0, 0);
//        System.out.println(ap1);

//        Triangle t = new Triangle(pointsList);
//        System.out.println(t);


//        double triP = t.getPerimeter();
//        System.out.println("The triangle perimeter is " + triP);

//        double triA = t.getArea();
//        System.out.println("The triangle area is " + triA);

//        Figure f1 = new Triangle(pointsList);
//        Figure f2 = new Rectangle(pointsList);
//        //Figure f3 = new Figure(); нельзя создавать объект абстрактного класса
//        Figure f4 = (Figure) t;
//        ((Triangle) f4).getPerimeter();

//        Rectangle rect = new Rectangle(pointsList);
//        System.out.println(rect);

//        double rec = rect.getPerimeter();
//        System.out.println("The rectangle perimeter is " + rec);
//
//        double squareRec = rect.getArea();
//        System.out.println("The rectangle area is " + squareRec);
//
//        Circle circle = new Circle(pointsList);


    }
}

