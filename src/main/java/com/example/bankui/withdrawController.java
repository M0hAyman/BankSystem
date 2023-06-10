package com.example.bankui;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class withdrawController implements Initializable {
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

    @Override
    public void initialize(URL location, ResourceBundle arg1)
    {
        currentbalancelbl.setText("Your current Balance is: "+LoginController.curracc.getBalance());
        //nameLabel.setText("$ "+LoginController.account1.getBalance());

        //static_label=nameLabel;
    }
    public void confirmWithdrawAmountbtnfn(ActionEvent event)  {
        long nano_startTime = System.nanoTime();
        //currentbalancelbl.setText();
        confirmwithdrawlbl.setWrapText(true);
        String amount_input =withdrawamounttxt.getText();
        try {
            int i = Integer.parseInt(amount_input);
            if(LoginController.curracc.withdraw(i) == -1){
                confirmwithdrawlbl.setText("Invalid input. Please enter a valid POSITIVE amount.");

            } else {
                //LoginController.curracc.withdraw(i);
                confirmwithdrawlbl.setText(LoginController.curruser.getName()+" Your New Balance is: " + LoginController.curracc.getBalance());
            }
        } catch (NumberFormatException e) {
            // Display an error message to the user if the input is invalid
            confirmwithdrawlbl.setText("Invalid input. Please enter a valid amount.");
        }

        long nano_endTime = System.nanoTime();

        // Print the time taken by subtracting
        // the end-time from the start-time
        System.out.println("Time taken --for the withdraw function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
    public void checkmyBalancebtnfn(ActionEvent event) {
        long nano_startTime = System.nanoTime();
        currentbalancelbl.setText("Your current Balance is: "+LoginController.curracc.getBalance());
        long nano_endTime = System.nanoTime();

        // Print the time taken by subtracting
        // the end-time from the start-time
        System.out.println("Time taken --for the checkBalance in withdraw function-- in nano seconds: "+(nano_endTime - nano_startTime));

    }

    public void backInWithdrawbtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();

        LoginController.m.changeScene("menu.fxml");

        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the back in withdraw function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
}
