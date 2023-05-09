package com.example.question4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        
        Pane pane = new Pane();
        String[] java = "Welcome to Java".split("");
        Font font = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 30);

        Point2D center = new Point2D(200, 200);

        double radius = 100;
        double angle = 0;
        double rotate = 90;

        for (int i = 0; i < java.length; i++, angle += 22, rotate += 22) {

            double x = center.getX() + radius * Math.cos(Math.toRadians(angle));
            double y = center.getY() + radius * Math.sin(Math.toRadians(angle));
            Text text = new Text(x, y,java[i]);
            text.setRotate(rotate);
            text.setFont(font);
            pane.getChildren().add(text);

        }

        Stage s1 = new Stage();
        Scene scene = new Scene(pane, 400, 400);
        s1.setScene(scene);
        s1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}