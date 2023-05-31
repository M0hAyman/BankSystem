package com.example.bankui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField textboxid1;

    String txt;
    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        welcomeText.setText("Welcome to JavaFX Application!");

    }

    @FXML
    protected void onDisplayButtonClick(ActionEvent event) throws IOException {
        txt= textboxid1.getText();
        welcomeText.setText(txt);

    }
}