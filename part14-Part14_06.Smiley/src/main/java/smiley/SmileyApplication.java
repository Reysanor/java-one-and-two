package smiley;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {


    @Override
    public void start(Stage window) {

        BorderPane paintingLayout = new BorderPane();
        Canvas paintingCanvas = new Canvas(400, 400);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        paintingLayout.setCenter(paintingCanvas);
        painter.setFill(Color.WHITE);
        painter.fillRect(0,0,400,400);
        painter.setFill(Color.BLACK);
        painter.fillRect(100, 40, 50, 50);
        painter.fillRect(240, 40, 50, 50);
        painter.fillRect(50, 200, 50, 50);
        painter.fillRect(300, 200, 50, 50);
        painter.fillRect(100, 250, 200, 50);


        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}
