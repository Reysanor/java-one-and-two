package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {


    @Override
    public void start(Stage window) {

        Button buttonBP = new Button("To the second view!");
        Button buttonVB = new Button("To the third view!");
        Button buttonGP = new Button("To the first view!");

        BorderPane bp = new BorderPane();

        bp.setTop(new Label("First view!"));
        bp.setCenter(buttonBP);

        VBox vBox = new VBox();
        vBox.getChildren().add(buttonVB);
        vBox.getChildren().add(new Label("Second view!"));

        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Third view!"),0,0);
        gridPane.add(buttonGP,1,1);


        Scene first = new Scene(bp);
        Scene second = new Scene(vBox);
        Scene third = new Scene(gridPane);


        buttonBP.setOnAction((event) -> {
            window.setScene(second);
        });
        buttonVB.setOnAction((event) -> {
            window.setScene(third);
        });
        buttonGP.setOnAction((event) -> {
            window.setScene(first);
        });


        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
       launch(MultipleViews.class);
    }

}
