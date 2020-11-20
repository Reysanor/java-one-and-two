package textstatistics;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea();
        layout.setCenter(textArea);

        Label one = new Label("Letters: 0");
        Label two = new Label("Words: 0");
        Label three = new Label("The longest word is:");

        HBox labels = new HBox();
        labels.setSpacing(10.0);
        labels.getChildren().add(one);
        labels.getChildren().add(two);
        labels.getChildren().add(three);
        layout.setBottom(labels);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            one.setText("Letters: " + characters);
            two.setText("Words: " + words);
            three.setText("The longest word is: " + longest);

        });
    }

}
