package com.example.polyshape;

import javafx.scene.paint.Paint;

public class MyOval extends MyBoundedShape {
    protected Paint isFull;

    public MyOval (int x1, int x2, int y1, int y2, Paint color, Paint isFull){ // maybe boolean isFull
        super(x1,x2,y1,y2,color);
        this.isFull = isFull;
    }

}
