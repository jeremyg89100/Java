import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Scanner;

public class Exo6 {
    @FXML private TableView<Personne> maTable;

    @FXML private TableColumn<Personne, String> colNom;

    @FXML private TableColumn<Personne, String> colPrenom;

    @FXML private TableColumn<Personne, Integer> colAge;

    @FXML private TextField inputNom;

    @FXML private TextField inputPrenom;

    @FXML private TextField inputAge;

    @FXML private TextField inputId;

    @FXML
    public void getValues() {
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colPrenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));

        maTable.getItems().add(new Personne("Federer", "Roger", 40));
        maTable.getItems().add(new Personne("Nadal", "Rafael", 39));
    }

    @FXML
    public void addPerson() {
        String nom = inputNom.getText();
        String prenom = inputPrenom.getText();
        Integer age = Integer.parseInt(inputAge.getText());

        maTable.getItems().add(new Personne(nom, prenom, age));

        inputNom.clear();
        inputPrenom.clear();
        inputAge.clear();
    }

    @FXML
    public void deletePerson() {
        Personne select = maTable.getSelectionModel().getSelectedItem();

        if (select != null) {
            maTable.getItems().remove(select);
        } else System.out.println("Veuillez sélectionner une personne du tableau");
    }
}
