package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingPage {
    public static Stage stage;

    public LandingPage() {
    }
    public LandingPage(Stage stage) {
        this.stage=stage;
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            stage.setTitle("main page");
            stage.setScene(new Scene(root, 500, 275));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
