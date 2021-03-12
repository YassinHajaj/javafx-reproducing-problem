package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ChildController extends VBox {

    @FXML
    public TextField textFieldController;

    public String getTextFieldValue() {
        return textFieldController.getText();
    }
}
