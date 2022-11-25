package com.example.polyshape;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public abstract class MyBoundedShape extends MyShape {
    protected Boolean isFull;

    /* for MyBoundedShape x1 and y1 will represent the left corner,
     x2 will be the width and y2 will be the height. */
    public MyBoundedShape (int x1, int x2, int y1, int y2, Paint color, Boolean isFull){
        super(x1,x2,y1,y2,color);
        this.isFull = isFull;
    }

    public void makeEmpty() { //Getter for MyBoundedShape, determine whether the shape should be filled or not.
        this.isFull = false;
    }

    @Override
    public boolean equals(Object other) {
        /*The object and the curr shape must be both either an oval or a rectangle.
          if it's the case, check its height and width. */
        if (other instanceof MyOval && this instanceof MyOval || other instanceof MyRectangle && this instanceof MyRectangle) {
            MyBoundedShape b = (MyBoundedShape) other; //Casting in order to compare
            return this.y1 == b.y1 && this.y2 == b.y2;
        }
        return false;
    }

    /*Depends on isFull, we choose if we want to set the fill or the stroke color.
      This function will be inherited using super.*/
    public void draw(GraphicsContext gc) {
        if(isFull)
            gc.setFill(this.color);
        else
            gc.setStroke(this.color);
    }


}
