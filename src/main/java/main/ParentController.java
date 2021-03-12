package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ParentController extends VBox {

    @FXML
    public ChildController childController;
    @FXML
    public TextField hBoxTextField;

    public void init() {
        hBoxTextField.getText();
        childController.getTextFieldValue();
    }
}
