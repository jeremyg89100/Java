import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exo8 {
    @FXML
    private Button ouvrir;

    @FXML
    public void newWindows() {
        ouvrir.setOnMouseClicked(event ->
        {Button button1 = new Button("Fermer la fenêtre");
            Pane root = new Pane(button1);
            Scene scene = new Scene(root, 600, 400);
            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("Exo8NewFenetre");
            secondaryStage.setScene(scene);
            secondaryStage.show();

            button1.setOnMouseClicked(e -> secondaryStage.close());
        });
    }
}
