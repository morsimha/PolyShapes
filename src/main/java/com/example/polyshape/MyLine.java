package com.example.polyshape;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class MyLine extends MyShape {

    /* for MyLine x1 and y1 will represent the top left corner,
     x2 and y2 will represent the bottom right corner. */
    public MyLine(int x1, int x2, int y1, int y2, Paint color) {
        super(x1, x2, y1, y2, color);
    }

    public void draw(GraphicsContext gc) {

        gc.setStroke(this.color);
        gc.strokeLine(this.x1, this.y1, this.x2, this.y2);

    }


    @Override
    public boolean equals(Object other) { //TODO: change to doubles maybe
        if ((other instanceof MyLine)) { // Checks that the argument is indeed any kind of Expression
            MyLine b = (MyLine) other; //Casting in order to compare
            return calcDistance(this) == calcDistance(b);
        }
        return false;
    }

    public double calcDistance(MyLine l1) {
        return Math.sqrt((l1.getX1() - l1.getX2()) * (l1.getX1() - l1.getX2()) + (l1.getY1() - l1.getY2()) * (l1.getY1() - l1.getY2()));
    }

}


