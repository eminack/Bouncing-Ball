package com.company;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Simulation {
    int time = 25;
    double dy = 2;
    double g = 0.98, e = 0;

    public void simulate(Circle ball) {


        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(time),
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println(ball.getLayoutY());
                        if (ball.getLayoutY() + ball.getRadius() + dy > 900) {
                            dy = -dy;
                            dy = dy * e;

                        } else {
                            dy += g;
                        }
                        ball.setLayoutY((ball.getLayoutY() + dy));
                    }
                }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    ;
}






//        Timeline timeline=new Timeline(new KeyFrame(Duration.millis(time),
//                new EventHandler<ActionEvent>(){
//                    @Override
//                    public void handle(ActionEvent actionEvent) {
//                        ball.setLayoutY(ball.getLayoutY()+dy);
//                        if((ball.getLayoutY() >= (900 - ball.getRadius()) )){
//                            dy=-dy;
//                            i=i+50;
//                        }
//
//                        else if((ball.getLayoutY() <= i )){
//                            dy=-dy;
//                        }
//                    }
//                }));
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.play();
//    }
//}