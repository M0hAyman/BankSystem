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


    public void confirmItembtnfn(ActionEvent event) {
        long nano_startTime = System.nanoTime();
        confirmlbl.setWrapText(true);
        String amount_input =item_price_txt.getText();
        try {
            int i = Integer.parseInt(amount_input);
            if(LoginController.curruser.buy_item(i)== -1){
                confirmlbl.setText("Invalid input. Please enter a valid POSITIVE amount.");
            }else{
                //LoginController.curruser.buy_item(i);
                confirmlbl.setText(LoginController.curruser.getName()+" Your New Balance is: " + LoginController.curracc.getBalance()+"and you bought "+item_name_txt.getText());

            }
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmlbl.setText("Invalid input. Please enter a valid amount.");
        }

        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the buyItems function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }

    public void backInBuybtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        LoginController.m.changeScene("menu.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the back in buyItem function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
}
