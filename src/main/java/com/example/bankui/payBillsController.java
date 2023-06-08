package com.example.bankui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;

public class payBillsController {

//    Account account1=new Account();
//    User user1=new User("mohamed","male",account1,"ssssss","1234");

    @FXML
    private Button confirmbtn;

    @FXML
    private Button backInBillsbtn;

    @FXML
    private Label confirmlbl;

    @FXML
    private TextField amounttxt;

    public void confirmAmountbtnfn(ActionEvent event) {
        confirmlbl.setWrapText(true);
        String amount_input =amounttxt.getText();
        try {
            int i = Integer.parseInt(amount_input);

            if(LoginController.curruser.pay_bills(i) == -1)
            {
                confirmlbl.setText("Invalid input. Please enter a valid POSITIVE integer amount.");
            }
            else {
                LoginController.curruser.pay_bills(i);
                confirmlbl.setText(LoginController.curruser.getName() + " Your New Balance is: " + LoginController.curracc.getBalance());
            }
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmlbl.setText("Invalid input. Please enter a valid integer amount.");
        }
    }

    public void backInBillsbtnfn(ActionEvent event) throws IOException {
        LoginController.m.changeScene("menu.fxml");
    }
}
