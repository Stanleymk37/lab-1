package com.example.hellofx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HelloJavaFX extends Application {
    public void start(Stage stage) {
        Label message = new Label("Welcome, Tinashe Mukalati ID 202512467");
        Button button = new Button("Press");
        button.setOnAction(event -> message.setText("Good."));
        Button resetButton = new Button("Rest");
        resetButton.setOnAction(event->message.setText("Welcome, Tinashe Mukalati ID 202512467"));
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(message,button,resetButton);
        Scene scene = new Scene(layout, 500, 300);
        stage.setTitle("My First JavaFX Application 202512467");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}