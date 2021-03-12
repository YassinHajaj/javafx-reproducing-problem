package main;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class ParentView extends VBox {

    @FXML
    public ChildView childController;

    public void init() {
        System.out.println("childController.getTextFieldValue() = " + childController.getTextFieldValue());
    }
}
