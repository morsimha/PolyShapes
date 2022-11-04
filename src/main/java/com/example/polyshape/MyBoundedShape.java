package com.example.polyshape;

import javafx.scene.paint.Paint;

public abstract class MyBoundedShape extends MyShape {

    public MyBoundedShape (int x1, int x2, int y1, int y2, Paint color){
        super(x1,x2,y1,y2,color);
    }

//    public boolean equals(Object other){
//        return (this.y1 == other.y1)
//    }

    @Override
    public boolean equals(Object other) {
        if ((other instanceof MyBoundedShape)) { // Checks that the argument is indeed any kind of Expression
            MyBoundedShape b = (MyBoundedShape) other; //Casting in order to compare
            return this.y1 == b.y1 && this.y2 == b.y2;
        }
        return false;
    }


}
