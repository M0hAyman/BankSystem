package com.example.bankui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
public class buyItemController {

    @FXML
    private Button confirmbtn;

    @FXML
    private Button backInBuybtn;

    @FXML
    private Label confirmlbl;

    @FXML
    private TextField item_name_txt;

    @FXML
    private TextField item_price_txt;


    public void confirmItembtnfn(ActionEvent event) throws IOException {
        confirmlbl.setWrapText(true);
        String amount_input =item_price_txt.getText();
        try {
            int i = Integer.parseInt(amount_input);
            LoginController.user1.buy_item(i);
            confirmlbl.setText(LoginController.user1.getName()+" Your New Balance is: " + LoginController.account1.getBalance()+"and you bought "+item_name_txt.getText());
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmlbl.setText("Invalid input. Please enter a valid integer amount.");
        }
    }

    public void backInBuybtnfn(ActionEvent event) throws IOException {
        LoginController.m.changeScene("menu.fxml");
    }
}
