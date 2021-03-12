package main;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class ParentView extends VBox {

    @FXML
    public ChildView child;

    public void init() {
        System.out.println("childController.getTextFieldValue() = " + child.getTextFieldValue());
    }
}
