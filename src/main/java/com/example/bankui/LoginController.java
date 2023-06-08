package com.example.bankui;

import com.almasb.fxgl.entity.level.tiled.TextData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class LoginController{
    public LoginController(){

    }

    static Account account1=new Account();

    static Account account2=new Account();

    static User user1=new User("mohamed","male",account1,"ssssss","1234");

    static User user2=new User("som3a","male",account2,"yyyyyy","5678");

    static ArrayList<User> users= new ArrayList<>() {
        {
            add(user1);
            add(user2);
        }
    };

    static ArrayList<Item> items= new ArrayList<>();
    @FXML
    private Button loginbtn;

    @FXML
    private Label wrongLogin;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    private Stage stage;
    private Scene scene;
    private Parent root;
    public void userLogin(ActionEvent event) throws IOException {

        checkLogin();

    }
    public static String name;
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
        if (username.getText().equals(user1.getName()) && password.getText().equals(user1.getPassword()))
        {
            wrongLogin.setText("Success!");
            //MainMenuController mController =new MainMenuController();
            //mController.displayName(username.getText());
            //static_label.setText("Hello: " + username.getText());
            name=username.getText();
            m.changeScene("menu.fxml");
        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");
        }else {
            wrongLogin.setText("Wrong username or password");
        }
    }

    public void initialize() {
        password.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER)) {
                try {
                    checkLogin();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
