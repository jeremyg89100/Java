import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.sql.Time;
import java.util.Random;

public class Exo11 {
    @FXML
    private Button start;

    @FXML
    private Pane rootPane;

    private Random random = new Random();

    private Integer count = 0;


    @FXML
    public void speedClicGame() {
        Button button = new Button();
        rootPane.getChildren().add(button);
        Label label = new Label(count.toString());
        rootPane.getChildren().add(label);
        label.setLayoutX(0);
        label.setLayoutY(370);
        double maxX = rootPane.getWidth() - button.getWidth();
        double maxY = (rootPane.getHeight() - 20) - button.getHeight();

        start.setOnMouseClicked(event -> {
            rootPane.getChildren().remove(start);

            Integer[] temps = {30};
            Label timerLabel = new Label("Timer : " + temps[0]);
            rootPane.getChildren().add(timerLabel);
            timerLabel.setLayoutX(300);
            timerLabel.setLayoutY(5);

            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
                    temps[0]--;
                    timerLabel.setText("Timer : " + temps[0]);
                    button.setLayoutX(random.nextDouble(0, maxX));
                    button.setLayoutY(random.nextDouble(0, maxY));
                }));

                timeline.setCycleCount(30);
                timeline.play();

                button.setOnMouseClicked(ev -> {
                    button.setLayoutX(random.nextDouble(0, maxX));
                    button.setLayoutY(random.nextDouble(0, maxY));
                    count++;
                    label.setText(count.toString());
                });
        });
    }
}