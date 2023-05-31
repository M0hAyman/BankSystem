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
}
