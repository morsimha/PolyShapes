package com.example.polyshape;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class MyOval extends MyBoundedShape {


    public MyOval(int x1, int x2, int y1, int y2, Paint color, Boolean isFull) {
        super(x1, x2, y1, y2, color, isFull);
    }

    //choosing what will be drawn depends on isFull value.
    public void draw(GraphicsContext gc) {
        super.draw(gc);
        if(isFull)
            gc.fillOval(this.x1, this.x2, this.y1, this.y2); //filling inside color
        else
            gc.strokeOval(this.x1, this.x2, this.y1, this.y2); //filling outline color

    }
}

