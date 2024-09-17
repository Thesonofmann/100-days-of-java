package day55;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class Authenticate extends Application{

//public Authenticate(String username, String password){
//    this.username = username;
//    this.password = password;
//}
private String username = "User1";
private String password = "password1";

HashMap<String, String> userData = new HashMap<String, String>();


public boolean login(String username, String password){
//    function to check if username and password accepted exists in the database
    for (String i : userData.keySet()){
        if (i.equals(username) && userData.get(i).equals(password)){
//            System.out.println("Login Success");
            return true;
        }
    }
    return false;
}

public void signUp(String username, String password){
    userData.put(username, password);
//    System.out.println("SIGN UP SUCCESSFUL");

}
@Override
public void start(Stage stage) throws IOException{
    FXMLLoader fxmlLoader = new FXMLLoader(day55.Authenticate.class.getResource("auth.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 400, 500);
    stage.setTitle("Authenticate!");
    stage.setScene(scene);
    stage.show();

}


    public static void main(String[] args) {
    launch();

    }
}
