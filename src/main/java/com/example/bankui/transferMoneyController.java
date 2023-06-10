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

    public void transferbtnfn(ActionEvent event) {
        long nano_startTime = System.nanoTime();
        confirmlbl.setWrapText(true);
        String amount_input =transfer_price_txt.getText();
        String username_input =user_name_txt.getText();

        try {
            int i = Integer.parseInt(amount_input);
            for (User usr :LoginController.users){
                if (usr.getName().equals(username_input)){
                    if(!LoginController.curruser.getName().equals(username_input)) {
                        if(LoginController.curruser.Transfere_money_to(usr, i)== -1){
                            confirmlbl.setText("Invalid input. Please enter a valid POSITIVE amount.");
                        }else{
                            //LoginController.curruser.Transfere_money_to(usr, i);
                            confirmlbl.setText(LoginController.curruser.getName() + " Your New Balance is: " + LoginController.curracc.getBalance() + " and you transfered: " + amount_input + " to: " + username_input);
                        }
                        //System.out.println("Amount Transferred, Your Balance is: " + LoginController.curracc.getBalance());
                    }else confirmlbl.setText("Hey! You can not transfer money to yourself!!");
                    break;
                }else {
                    confirmlbl.setText("User not found!");

                }
            }
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmlbl.setText("Invalid input. Please enter a valid amount.");
        }
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the TransferMoney function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }

    public void backInTransferbtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        LoginController.m.changeScene("menu.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the back in TransferMoney function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
}
