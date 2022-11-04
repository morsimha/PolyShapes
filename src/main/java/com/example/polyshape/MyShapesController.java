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

        gc.setLineWidth(2);

        //lines:
        for (int i= 0; i<2;i++){
                //    gc.setFill(shapes.get(i).color); //choosing the right color for the cell
            gc.setStroke(shapes.get(i).getColor());

            gc.moveTo(shapes.get(i).getX1(), shapes.get(i).getX2()); //Top left corner
            gc.lineTo(shapes.get(i).getY1(), shapes.get(i).getY2()); //Bottom right corner
            gc.stroke();


        }
        gc.setStroke(Color.BLACK);


        //rects
        for (int i= 2; i<4;i++){
            //if (shapes.get(i).isFull())

            gc.strokeRect(shapes.get(i).getX1(), shapes.get(i).getY1(), shapes.get(i).getX2(), shapes.get(i).getY2()); //filling outline color
        //    gc.stroke();

            gc.setFill(shapes.get(i).getColor());
            gc.fillRect(shapes.get(i).getX1(), shapes.get(i).getY1(), shapes.get(i).getX2(), shapes.get(i).getY2()); //filling inside color
        }

        //ovals
        for (int i= 4; i<6;i++){
        //  gc.setStroke(Color.BLACK);
         //   gc.setLineWidth(2);
            gc.strokeOval(shapes.get(i).getX1(), shapes.get(i).getY1(), shapes.get(i).getX2(), shapes.get(i).getY2()); //filling outline color
            gc.setFill(shapes.get(i).getColor()); //choosing the right color for the cell
            gc.fillOval(shapes.get(i).getX1(), shapes.get(i).getY1(), shapes.get(i).getX2(), shapes.get(i).getY2()); //filling inside color
            //  gc.strokeRect(shapes.get(i).x1, shapes.get(i).x2, shapes.get(i).y1, shapes.get(i).y2); //filling outline color
        }

        ArrayList<MyShape> clonedShapes = new ArrayList <>();

        for (int i=0; i<shapes.size();i++){
            clonedShapes.add((MyShape) shapes.get(i).clone());
            clonedShapes.get(i).setX1(clonedShapes.get(i).getX1() + 10); //maybe add to curr x1 func
            clonedShapes.get(i).setY1(clonedShapes.get(i).getY1() + 10);
            clonedShapes.get(i).setColor(Color.GREEN);
            //clonedShapes.get(i).makeEmpty();
        }

        //lines:
        for (int i= 0; i<2;i++){
            //    gc.setFill(shapes.get(i).color); //choosing the right color for the cell
           // gc.setStroke(Color.YELLOW);
            gc.setStroke(clonedShapes.get(i).getColor());
            gc.moveTo(clonedShapes.get(i).getX1(), clonedShapes.get(i).getX2()); //Top left corner
            gc.lineTo(clonedShapes.get(i).getY1(), clonedShapes.get(i).getY2()); //Bottom right corner
            gc.stroke();
        }

        //rects
        for (int i= 2; i<4;i++){
            //if (shapes.get(i).isFull())
            gc.setStroke(clonedShapes.get(i).getColor());
            gc.strokeRect(clonedShapes.get(i).getX1(), clonedShapes.get(i).getY1(), clonedShapes.get(i).getX2(), clonedShapes.get(i).getY2()); //filling inside color
            //  gc.strokeOval(shapes.get(i).x1, shapes.get(i).x2, shapes.get(i).y1, shapes.get(i).y2); //filling outline color
        }

        //ovals
        for (int i= 4; i<6;i++){
            gc.setStroke(clonedShapes.get(i).getColor()); //choosing the right color for the cell
            // gc.setStroke(shapes.get(i).color);
            //gc.fillRect(0,0,10,10); //filling inside color
            gc.strokeOval(clonedShapes.get(i).getX1(), clonedShapes.get(i).getY1(), clonedShapes.get(i).getX2(), clonedShapes.get(i).getY2()); //filling inside color
            //  gc.strokeRect(shapes.get(i).x1, shapes.get(i).x2, shapes.get(i).y1, shapes.get(i).y2); //filling outline color
        }



    }
}
