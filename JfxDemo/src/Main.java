import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;

import java.util.Stack;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        exo7(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void exo1(Stage primaryStage) {
        VBox root = new VBox();
        Button btn = new Button("Test");

            btn.setOnMouseClicked(event ->

        {
            System.out.println("Bonjour Java FX !");
        });

            root.getChildren().

        add(btn);

        Scene scene = new Scene(root, 600, 400);

            primaryStage.setTitle("JavaFX Test avec FXML");
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    public void exo2(Stage primaryStage) {
        Text text = new Text("Appuie sur une touche");

        StackPane root = new StackPane(text);
        Scene scene = new Scene(root, 600, 400);

        scene.setOnKeyPressed(event -> text.setText("Touche pressée : " + event.getText()));
        primaryStage.setTitle("Exo2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private int number = 0;
    public void exo3(Stage primaryStage) {
        Label label = new Label("Nombre : "+ number);
        Button button = new Button("Incrémente");
        Button button1 = new Button("Décremente");

        VBox root = new VBox(label, button, button1);
        Scene scene = new Scene(root, 600, 400);

        button.setOnMouseClicked(event -> {
            number++;
            label.setText("Nombre : " + number);
        });
        button1.setOnMouseClicked(event -> {
            number--;
            label.setText("Nombre : " + number);
        });

        primaryStage.setTitle("Exo3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void exo4(Stage primaryStage) {
        Button button = new Button("Rouge");
        Button button1 = new Button("Vert");
        Button button2 = new Button("Bleu");

        VBox root = new VBox(button, button1, button2);
        Scene scene = new Scene(root, 600, 400);

        button.setOnMouseClicked(event -> root.setStyle("-fx-background-color: red"));
        button1.setOnMouseClicked(event -> root.setStyle("-fx-background-color: green"));
        button2.setOnMouseClicked(event -> root.setStyle("-fx-background-color: blue"));

        primaryStage.setTitle("Exo4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void exo5(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/exo5.fxml"));
            primaryStage.setTitle("Exo 5");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        }
        catch (IOException e) {
            System.err.println("Impossible de charger le fichier FXML !");
            e.printStackTrace();
        }
    }

    public void exo6(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/exo6.fxml"));
            Parent root = loader.load();

            Exo6 controller = loader.getController();
            controller.getValues();

            primaryStage.setTitle("Exo 6");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        }
        catch (IOException e) {
            System.err.println("Impossible de charger le fichier FXML");
            e.printStackTrace();
        }
    }
    public void exo7(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/exo7.fxml"));
            primaryStage.setTitle("Exo7");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Impossible de charger le fichier FXML");
            e.printStackTrace();
        }
    }
    public void exo8(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/exo8.fxml"));
            primaryStage.setTitle("Exo8");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Impossible de charger le fichier FXML");
            e.printStackTrace();
        }
    }
    public void exo9(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/exo9.fxml"));
            primaryStage.setTitle("Exo9");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Impossible de charger le fichier FXML");
            e.printStackTrace();
        }
    }
    public void exo10(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/exo10.fxml"));
            primaryStage.setTitle("Exo10");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Im possible de charger le fichier FXML");
            e.printStackTrace();
        }
    }
    public void exo11(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/exo11.fxml"));
            primaryStage.setTitle("Exo11");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Impossible de charger le fichier FXML");
            e.printStackTrace();
        }
    }
}