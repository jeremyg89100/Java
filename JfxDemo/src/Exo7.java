import javafx.fxml.FXML;
import java.io.File;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;

public class Exo7 {
    @FXML
    private ListView<File> listView;

    @FXML
    private ImageView imageView;

    @FXML
    public void handleDragDetection(MouseEvent event) {
        File selectedFile = listView.getSelectionModel().getSelectedItem();

        if (selectedFile != null) {
            Dragboard db = listView.startDragAndDrop(TransferMode.COPY);

            ClipboardContent content = new ClipboardContent();
            content.putFiles(java.util.List.of(selectedFile));
            db.setContent(content);
        }
        event.consume();
    }
    @FXML
    public void handleDragOver(DragEvent event) {
        if (event.getDragboard().hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY);
        }
        event.consume();
    }

    @FXML
    public void handleDragDrop(DragEvent event) {
        Dragboard db = event.getDragboard();

        if (db.hasFiles()) {
            File file = db.getFiles().get(0);
            Image img = new Image(file.toURI().toString());
            imageView.setImage(img);
        }
        event.consume();
    }

    @FXML
    public void initialize() {
        File chien1 = new File("img/chien1.jpg");
        File chien2 = new File("img/chien2.jpg");
        File chien3 = new File("img/chien3.jpg");

        listView.getItems().addAll(chien1, chien2, chien3);

    }
}
