import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Exo5 {
    @FXML
    private ComboBox<String> cbbox;

    @FXML
    private Label resultLabel;

    @FXML
    public void handleSelection() {
        String getCity = cbbox.getValue();
        if (getCity != null) {
            resultLabel.setText("Vous avez choisi : " + getCity);
        }
    }
}
