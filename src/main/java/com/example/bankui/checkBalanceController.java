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
        long nano_startTime = System.nanoTime();
        currentbalancelbl.setText("Your current Balance is: "+LoginController.curracc.getBalance());
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the checkBalance function-- in nano seconds: "+(nano_endTime - nano_startTime));

    }

    public void backInCheckBalancebtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        LoginController.m.changeScene("menu.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the back in CheckBalance function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
}
