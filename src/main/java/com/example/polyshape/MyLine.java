package com.example.polyshape;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

import static java.lang.Math.round;

public class MyLine extends MyShape {

    /* for MyLine x1 and y1 will represent the top left corner,
     x2 and y2 will represent the bottom right corner. */
    public MyLine(int x1, int x2, int y1, int y2, Paint color) {
        super(x1, x2, y1, y2, color);
    }

    @Override
    public boolean equals(Object other) {
        if ((other instanceof MyLine)) { // Checks that the argument is a Line.
            MyLine b = (MyLine) other; //Casting in order to compare
            return calcDistance(this) == calcDistance(b);
        }
        return false;
    }

    public double calcDistance(MyLine line) { //Calculating the line using the distance formula, and rounding the result.
        return round(Math.sqrt((line.getX1() - line.getX2()) * (line.getX1() - line.getX2()) + (line.getY1() - line.getY2()) * (line.getY1() - line.getY2())));
    }

    //Line is drawn using Stroke functions.
    public void draw(GraphicsContext gc) {
        gc.setStroke(this.color);
        gc.strokeLine(this.x1, this.y1, this.x2, this.y2);
    }


}


