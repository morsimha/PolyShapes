package com.example.polyshape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyShapes extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MyShapes.fxml"));
        primaryStage.setTitle("MyShapes");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


//TODO: make equal works for non object maybe
// comments
//make similar loops the same maybe with a function.