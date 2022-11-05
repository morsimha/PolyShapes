/**
 * Maman 12, question 2.
 * Mor Simha, 206029993.
 */

package com.example.polyshape;



import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;


public class MyShapesController{
    @FXML
    private Canvas cnvs;

    private final int SIZE = 200;
    private GraphicsContext gc;

    public void initialize() throws CloneNotSupportedException {
        gc = cnvs.getGraphicsContext2D();
        gc.setLineWidth(2); //Setting the drawing lines width
        drawShapes();
    }

    public void drawShapes() throws CloneNotSupportedException {
        Random rand = new Random();
        ArrayList<MyShape> shapes = new ArrayList <>();
        ArrayList<MyShape> clonedShapes = new ArrayList <>();
        MyLine line1 = new MyLine(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED);
        MyLine line2 = new MyLine(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED);
        MyRectangle rect1 = new MyRectangle(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);
        MyRectangle rect2 = new MyRectangle(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);
        MyOval oval1 = new MyOval(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);
        MyOval oval2 = new MyOval(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);

        shapes.add(rect1);
        shapes.add(rect2);
        shapes.add(oval1);
        shapes.add(oval2);
        shapes.add(line1);
        shapes.add(line2);

        for (int i=0; i<shapes.size();i++){ //Cloning, Changing the x1 & y1 parameters and making the shapes empty.
            clonedShapes.add((MyShape) shapes.get(i).clone());
            clonedShapes.get(i).setX1(clonedShapes.get(i).getX1() + 10); //maybe add to curr x1 func
            clonedShapes.get(i).setY1(clonedShapes.get(i).getY1() + 10);
            clonedShapes.get(i).setColor(Color.GREEN);
            if (clonedShapes.get(i) instanceof MyBoundedShape) //Only rects and ovals need to be filled with color.
                ((MyBoundedShape) clonedShapes.get(i)).makeEmpty();
        }

        for (int i=0; i<shapes.size();i++) { //drawing both lists shapes after the clone and changes
            shapes.get(i).draw(gc);
            clonedShapes.get(i).draw(gc);
        }
    }
}
