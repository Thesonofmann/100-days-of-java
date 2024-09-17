package day55;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController3{
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Label login;

    public Authenticate auth;

    public HelloController3() {
        auth = new Authenticate();
    }

    @FXML
    protected void onLoginClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (auth.login(username, password)){
            login.setText("Login Successful");
        } else{
            login.setText("Invalid Credentials");
        }

    }

    @FXML
    protected void onSignUpClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        auth.signUp(username, password);
        passwordField.clear();
        login.setText("User Successfully Added");


    }
}
