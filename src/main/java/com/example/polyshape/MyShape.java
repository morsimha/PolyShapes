package com.example.polyshape;

import javafx.scene.paint.Paint;

public abstract class MyShape implements Cloneable {
    // rectangle uses x,y than width and height
    // but shapes uses x1,y1 and x2.y2
    //put constructor in my shape

    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected Paint color;


    public MyShape (int x1,int x2,int y1,int y2, Paint color){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
    }

    public int getX1() {
        return this.x1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY1() {
        return this.y1;
    }

    public int getY2() {
        return this.y2;
    }

    public Paint getColor() {
        return this.color;
    }

    public abstract boolean equals(Object other);


    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }




}
