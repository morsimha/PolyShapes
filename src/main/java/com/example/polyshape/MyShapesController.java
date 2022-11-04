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
        MyLine line1 = new MyLine(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.DARKBLUE);
        MyLine line2 = new MyLine(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED);
        MyRectangle rect1 = new MyRectangle(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, Color.BLACK);
        MyRectangle rect2 = new MyRectangle(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, Color.BLACK);
        MyOval oval1 = new MyOval(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, Color.BLACK);
        MyOval oval2 = new MyOval(rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE),rand.nextInt(SIZE), Color.RED, Color.BLACK);

        MyLine copy = (MyLine) line1.clone();
      //  System.out.println(copy.color.);

        shapes.add(line1);
//        shapes.add(copy);
//        line1.color = Color.RED;
//        line1.x1 = rand.nextInt(200);
//        line1.x2 =  rand.nextInt(200);
//        line1.y1 = rand.nextInt(200);
//        line1.y2 = rand.nextInt(200);

        shapes.add(line2);
        shapes.add(rect1);
        shapes.add(rect2);
        shapes.add(oval1);
        shapes.add(oval2);



        //TODO: use fill_oval and stuff
        for (int i= 0; i<2;i++){
        gc.setFill(shapes.get(i).color); //choosing the right color for the cell
       // gc.setStroke(shapes.get(i).color);
        gc.fillRect(shapes.get(i).x1, shapes.get(i).x2, shapes.get(i).y1, shapes.get(i).y2); //filling inside color
      //  gc.strokeRect(shapes.get(i).x1, shapes.get(i).x2, shapes.get(i).y1, shapes.get(i).y2); //filling outline color
        }

        for (int i= 2; i<4;i++){
            gc.setFill(shapes.get(i).color); //choosing the right color for the cell
         //   gc.setStroke(shapes.get(i).color);
            gc.fillOval(shapes.get(i).x1, shapes.get(i).x2, shapes.get(i).y1, shapes.get(i).y2); //filling inside color
          //  gc.strokeOval(shapes.get(i).x1, shapes.get(i).x2, shapes.get(i).y1, shapes.get(i).y2); //filling outline color
        }

        for (int i= 4; i<6;i++){
        //    gc.setFill(shapes.get(i).color); //choosing the right color for the cell
            gc.setStroke(shapes.get(i).color);
            gc.moveTo(shapes.get(i).x1, shapes.get(i).x2);
            gc.lineTo(shapes.get(i).y1, shapes.get(i).y2); //filling inside color
            gc.stroke(); //filling outline color
        }

        rand.nextInt(SIZE);

    }
}
