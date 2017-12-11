package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    public static Stage stage;
    @FXML
    public  javafx.scene.control.Button button;
    @FXML
    public  javafx.scene.control.TextField email,password;
    @FXML

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bar Login");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    public void loginApi(){
        String email_user=email.getText();
        String password_user=password.getText();
        System.out.println("value : "+email_user+"/ / "+password_user);
        if(email_user!=null && password_user!=null){
             new LandingPage(stage);

        }

    }
}
