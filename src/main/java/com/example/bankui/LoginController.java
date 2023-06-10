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
    static User curruser;
    static Account curracc;

    static ArrayList<User> users= new ArrayList<>() {
        {
            add(user1);
            add(user2);
        }
    };

    //static ArrayList<Item> items= new ArrayList<>();
    @FXML
    private Button loginbtn;

    @FXML
    private Label wrongLogin;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;
    public void userLogin(ActionEvent event) throws IOException {
        long nano_startTime = System.nanoTime();
        checkLogin();
        long nano_endTime = System.nanoTime();
        System.out.println("Time taken --for the login function-- in nano seconds: "+(nano_endTime - nano_startTime));

    }
    public static String currname;
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
        if(username.getText().isEmpty() && password.getText().isEmpty())
        {
            wrongLogin.setText("Please enter your data.");
        }else {
            String username_input =username.getText();
            for (User usr :users){
                if (usr.getName().equals(username_input) && password.getText().equals(usr.getPassword())){
                    wrongLogin.setText("Success!");
                    currname= usr.getName();
                    curruser =usr;
                    curracc =usr.getAccount();
                    m.changeScene("menu.fxml");


                }else {
                    wrongLogin.setText("Wrong username or password");
                }
            }
        }

        /*
        if (username.getText().equals(user1.getName()) && password.getText().equals(user1.getPassword()))
        {
            wrongLogin.setText("Success!");
            currname=username.getText();
            m.changeScene("menu.fxml");
        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please enter your data.");
        }else {
            wrongLogin.setText("Wrong username or password");
        }

        */
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
