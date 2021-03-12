package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ChildView extends VBox {

    @FXML
    public TextField textField;

    public String getTextFieldValue() {
        return textField.getText();
    }
}
