package com.example.bankui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class Main extends Application {


    private static Stage stg;
    //static ArrayList<Users> users = {.............}
    //static String currUser;
    @Override
    public void start(Stage stage) throws Exception {
        stg =stage;
        stage.setResizable(false);
        Parent root =FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginView.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Bank System");
        stage.setScene(new Scene(root,600,400));
        stage.show();

    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        long nano_startTime = System.nanoTime();
        long millis_startTime = System.currentTimeMillis();

        launch();

        long nano_endTime = System.nanoTime();
        long millis_endTime = System.currentTimeMillis();

        // Print the time taken by subtracting
        // the end-time from the start-time
        System.out.println("Time taken --for the whole program-- in nano seconds: "+(nano_endTime - nano_startTime));
        System.out.println("Time taken --for the whole program-- in milli seconds: "+ (millis_endTime - millis_startTime));
        System.out.println("Time taken --for the whole program-- in seconds (approximated): "+ (millis_endTime - millis_startTime)/1000);
    }


}