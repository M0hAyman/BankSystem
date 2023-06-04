package com.example.bankui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
public class MainMenuController {

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

    Main m = new Main();

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
}
