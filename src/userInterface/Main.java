package userInterface;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.stage.Stage;
import backend.*;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("ui_layout.fxml"));
            primaryStage.setTitle("Vec Draw - Untitled");
            Scene scene = new Scene(root,900,600);
            scene.getStylesheets().add("userInterface/stylesheet.css");
            scene.getStylesheets().add("userInterface/menuBarStylesheet.css");
            primaryStage.setScene(scene);

            primaryStage.show();
            primaryStage.setOnCloseRequest(e -> Platform.exit());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
