package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL resource = getClass().getResource("/Parent.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(resource);
        Parent parent = fxmlLoader.load();

        stage.setScene(new Scene(parent));
        ((ParentController) fxmlLoader.getController()).init();
        stage.show();
    }
}
