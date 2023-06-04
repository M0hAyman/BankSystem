package com.example.bankui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
public class withdrawController {
    @FXML
    private Button confirmwithdrawbtn;
    @FXML
    private Button checkmyBalancebtn;
    @FXML
    private Button backInWithdrawbtn;

    @FXML
    private Label confirmwithdrawlbl;

    @FXML
    private Label currentbalancelbl;
    @FXML
    private TextField withdrawamounttxt;

    public void confirmWithdrawAmountbtnfn(ActionEvent event) throws IOException {
        //currentbalancelbl.setText();
        String amount_input =withdrawamounttxt.getText();
        try {
            int i = Integer.parseInt(amount_input);
            LoginController.account1.withdraw(i);
            confirmwithdrawlbl.setText(LoginController.user1.getName()+" Your New Balance is: " + LoginController.account1.getBalance());
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmwithdrawlbl.setText("Invalid input. Please enter a valid integer amount.");
        }
    }
    public void checkmyBalancebtnfn(ActionEvent event) throws IOException {
        currentbalancelbl.setText("Your current Balance is: "+LoginController.account1.getBalance());

    }

    public void backInWithdrawbtnfn(ActionEvent event) throws IOException {
        LoginController.m.changeScene("menu.fxml");
    }
}