package com.company;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball  {
    private Circle circle;
    double y;
    public Circle getCircle() {
        return circle;
    }

    Ball(){
        circle= new Circle(10, Color.YELLOW);
        circle.relocate(350,25);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}