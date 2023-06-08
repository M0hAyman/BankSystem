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
        nameLabel.setText("Hello Mr. " + LoginController.name +" !");
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
        m.changeScene("LoginView.fxml");
    }
    public void paybillsbtnfn(ActionEvent event) throws IOException {
        m.changeScene("pay-bills-view.fxml");
    }
    public void depositebtnfn(ActionEvent event) throws IOException {
        m.changeScene("deposit-view.fxml");
    }
    public void buyItembtnfn(ActionEvent event) throws IOException {
        m.changeScene("buy-items-view.fxml");
    }

    public void withdrawbtnfn(ActionEvent event) throws IOException {
        m.changeScene("withdraw-view.fxml");
    }

    public void transfermoneybtnfn(ActionEvent event) throws IOException {
        m.changeScene("transfer-money-view.fxml");
    }
    public void checkbalancebtnfn(ActionEvent event) throws IOException {
        m.changeScene("check-balance-view.fxml");
    }
}
