package com.example.bankui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
public class transferMoneyController {
    @FXML
    private Button transferbtn;

    @FXML
    private Button backInTransferbtn;

    @FXML
    private Label confirmlbl;

    @FXML
    private TextField user_name_txt;

    @FXML
    private TextField transfer_price_txt;

    public void transferbtnfn(ActionEvent event) throws IOException {
        confirmlbl.setWrapText(true);
        String amount_input =transfer_price_txt.getText();
        String username_input =user_name_txt.getText();

        try {
            int i = Integer.parseInt(amount_input);
            for (User usr :LoginController.users){
                if (usr.getName().equals(username_input)){
                    LoginController.user1.Transfere_money_to(usr,i);
                    confirmlbl.setText(LoginController.user1.getName()+" Your New Balance is: " + LoginController.account1.getBalance()+"and you transfered: "+amount_input+" to: "+username_input);
                }else {
                    confirmlbl.setText("User not found!");

                }
            }
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmlbl.setText("Invalid input. Please enter a valid integer amount.");
        }
    }

    public void backInTransferbtnfn(ActionEvent event) throws IOException {
        LoginController.m.changeScene("menu.fxml");
    }
}
