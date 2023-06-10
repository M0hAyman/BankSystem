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

public class MainMenuController implements Initializable {

    @FXML
    private Button logout;

    @FXML
    private Button paybillbtn;

    @FXML
    private Button depositebtn;

    @FXML
    private Button buyItembtn;
    @FXML
    private Button withdrawbtn;
    @FXML
    private Button transfermoneybtn;
    @FXML
    private Button checkbalancebtn;
    @FXML
    private Label nameLabel;

    //public static Label static_label;

    @Override
    public void initialize(URL location, ResourceBundle arg1)
    {
        nameLabel.setText("Hello Mr. " + LoginController.currname +" !");
        //nameLabel.setText("$ "+LoginController.account1.getBalance());

        //static_label=nameLabel;
    }
    Main m = new Main();
//    public void displayName(String username) {
//        static_label=nameLabel;
//        static_label.setText("Hello: " + username);
//        nameLabel.setText("Hello: " + username);
//    }
    public void userLogOut(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        m.changeScene("LoginView.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the logout function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
    public void paybillsbtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        m.changeScene("pay-bills-view.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the payBills switch function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
    public void depositebtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        m.changeScene("deposit-view.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the deposit switch function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
    public void buyItembtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        m.changeScene("buy-items-view.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the buyItem switch function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }

    public void withdrawbtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        m.changeScene("withdraw-view.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the withdraw switch function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }

    public void transfermoneybtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        m.changeScene("transfer-money-view.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the transferMoney switch function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
    public void checkbalancebtnfn(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        m.changeScene("check-balance-view.fxml");
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the checkBalance function-- in nano seconds: "+(nano_endTime - nano_startTime));
    }
}
