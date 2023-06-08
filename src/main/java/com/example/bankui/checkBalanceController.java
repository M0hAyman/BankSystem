package com.example.bankui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;


public class checkBalanceController {
    @FXML
    private Button checkmyBalancebtn;
    @FXML
    private Button backInCheckBalancebtn;

    @FXML
    private Label currentbalancelbl;

    public void checkmyBalancebtnfn(ActionEvent event) {
        currentbalancelbl.setText("Your current Balance is: "+LoginController.curracc.getBalance());

    }

    public void backInCheckBalancebtnfn(ActionEvent event) throws IOException {
        LoginController.m.changeScene("menu.fxml");
    }
}
