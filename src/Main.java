package com.company;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static sun.java2d.cmm.ColorTransform.Simulation;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Ball circle = new Ball();
        Simulation startSimulation = new Simulation();
        startSimulation.simulate(circle.getCircle());

        Group root = new Group();
        root.getChildren().addAll(circle.getCircle());
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root,900,900));
//        System.out.println();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
