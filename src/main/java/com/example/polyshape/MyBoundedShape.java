package com.example.polyshape;

import javafx.scene.paint.Paint;

public abstract class MyBoundedShape extends MyShape {
    protected Boolean isFull;

    /* for MyBoundedShape x1 and y1 will represent the left corner,
     x2 will be the width and y2 will be the height. */
    public MyBoundedShape (int x1, int x2, int y1, int y2, Paint color, Boolean isFull){
        super(x1,x2,y1,y2,color);
        this.isFull = isFull;

    }

    public boolean isFull() {
        return this.isFull;
    }

    public void makeEmpty() {
        this.isFull = false;
    }

    @Override
    public boolean equals(Object other) {
        if ((other instanceof MyBoundedShape)) { // Checks that the argument is indeed any kind of Expression
            MyBoundedShape b = (MyBoundedShape) other; //Casting in order to compare
            return this.y1 == b.y1 && this.y2 == b.y2;
        }
        return false;
    }


}
