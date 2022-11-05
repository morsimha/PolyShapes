package com.example.polyshape;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class MyRectangle extends MyBoundedShape {


    public MyRectangle(int x1, int x2, int y1, int y2, Paint color, Boolean isFull) {
        super(x1, x2, y1, y2, color, isFull);
    }

    public void draw(GraphicsContext gc) {

        gc.setFill(this.color);

        if(isFull)
            gc.fillRect(this.x1, this.x2, this.y1, this.y2); //filling inside color
        else
            gc.strokeRect(this.x1, this.x2, this.y1, this.y2); //filling outline color


    }
}
