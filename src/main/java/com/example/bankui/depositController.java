package com.example.bankui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;

public class depositController {

    @FXML
    private Button confirmdepositbtn;
    @FXML
    private Button backInDepbtn;

    @FXML
    private Label confirmdepositlbl;

    @FXML
    private TextField depamounttxt;

    public void confirmDepAmountbtnfn(ActionEvent event) {
        confirmdepositlbl.setWrapText(true);
        String amount_input =depamounttxt.getText();
        try {
            int i = Integer.parseInt(amount_input);
            if(LoginController.curracc.deposit(i)==-1){
                confirmdepositlbl.setText("Invalid input. Please enter a valid POSITIVE amount.");

            } else {
                //LoginController.curracc.deposit(i);
                confirmdepositlbl.setText(LoginController.curruser.getName()+" Your New Balance is: " + LoginController.curracc.getBalance());

            }
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmdepositlbl.setText("Invalid input. Please enter a valid amount.");
        }
    }
    public void backInDepbtnfn(ActionEvent event) throws IOException {
        LoginController.m.changeScene("menu.fxml");
    }
}
