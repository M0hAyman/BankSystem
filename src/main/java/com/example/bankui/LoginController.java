package com.example.bankui;

import com.almasb.fxgl.entity.level.tiled.TextData;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;

public class LoginController {
    public LoginController(){

    }
    static Account account1=new Account();
    static User user1=new User("mohamed","male",account1,"ssssss","1234");

    @FXML
    private Button loginbtn;

    @FXML
    private Label wrongLogin;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }
    static Main m = new Main();

    private void checkLogin() throws IOException {
        //String usrnameinput = username.getText();
        //String passinput = password.getText();
//        for(user : Main.users)
//        {
//            if (usrnameinput.equals( user.name))
//            {
//
//            }
//        }
        if (username.getText().toString().equals(user1.getName()) && password.getText().toString().equals(user1.getPassword()))
        {
            wrongLogin.setText("Success!");

            m.changeScene("menu.fxml");
        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");
        }else {
            wrongLogin.setText("Wrong username or password");
        }
    }
}
