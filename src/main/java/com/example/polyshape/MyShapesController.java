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
    //  GameOfLifeLogic game;

    public void initialize() throws CloneNotSupportedException {
//        game = new GameOfLifeLogic();
        gc = cnvs.getGraphicsContext2D();
       // gc.setLineWidth(6);
//        game.createFirstGeneration();
        drawShapes();
    }

    public void drawShapes() throws CloneNotSupportedException {
        Random rand = new Random();
        ArrayList<MyShape> shapes = new ArrayList <MyShape>();
        MyLine line1 = new MyLine(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED);
        MyLine line2 = new MyLine(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED);
        MyRectangle rect1 = new MyRectangle(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);
        MyRectangle rect2 = new MyRectangle(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);
        MyOval oval1 = new MyOval(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);
        MyOval oval2 = new MyOval(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, true);


        shapes.add(line1);
        shapes.add(line2);
        shapes.add(rect1);
        shapes.add(rect2);
        shapes.add(oval1);
        shapes.add(oval2);

        gc.setLineWidth(2);


        for (int i=0; i<shapes.size();i++) {
            shapes.get(i).draw(gc);
        }


            ArrayList<MyShape> clonedShapes = new ArrayList <>();

        for (int i=0; i<shapes.size();i++){
            clonedShapes.add((MyShape) shapes.get(i).clone());
            clonedShapes.get(i).setX1(clonedShapes.get(i).getX1() + 10); //maybe add to curr x1 func
            clonedShapes.get(i).setY1(clonedShapes.get(i).getY1() + 10);
            clonedShapes.get(i).setColor(Color.GREEN);
            if (clonedShapes.get(i) instanceof MyBoundedShape)
                ((MyBoundedShape) clonedShapes.get(i)).makeEmpty();
        }

        for (int i=0; i<shapes.size();i++) {
            clonedShapes.get(i).draw(gc);
        }
    }
}
