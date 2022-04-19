package com.company;

public class AxisPoint extends Point {

    private String axis;
    public AxisPoint(double x, double y) {
        super(x, y);
        if (x == 0 && y==0)
            this.axis = "I'm the origin";
        else if (y ==0)
            this.axis = "I'm an x point";
        else if (x == 0)
            this.axis = "I'm an y point";
        else
            this.axis = "???";

    }

    public String toString (){
        return "I am an axis point, not a regular point  like you";
    }
}
