import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

public class Exo9 {
    @FXML
    private Button charging;

    @FXML
    private ProgressBar progressBar;

    private double loading = 0;
    private double maxLoading = 100;

    @FXML
    public void loadProgressBar() {
        charging.setOnMouseClicked(event -> {
            if (loading < maxLoading) {
                loading += 5;
                double progressRatio = loading / maxLoading;
                progressBar.setProgress(progressRatio);
            }
        });
    }
}
