package textstatistics;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea();
        layout.setCenter(textArea);

        Label one = new Label("Letters: 0");
        Label two = new Label("Words: 0");
        Label three = new Label("The longest word is:");

        HBox labels = new HBox();
        labels.getChildren().add(one);
        labels.getChildren().add(two);
        labels.getChildren().add(three);
        layout.setBottom(labels);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
