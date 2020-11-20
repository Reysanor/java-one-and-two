package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        VBox box = new VBox();
        TextField sourceText = new TextField();
        Button button = new Button("Update");
        Label destinationText = new Label();

        button.setOnAction((event) -> {
            destinationText.setText(sourceText.getText());
        });

        box.getChildren().add(sourceText);
        box.getChildren().add(button);
        box.getChildren().add(destinationText);


        Scene scene = new Scene(box);
        window.setScene(scene);
        window.show();
    }
}
