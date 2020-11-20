package title;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
     //   String organization = params.getNamed().get("organization");
        String title = params.getNamed().get("title");

        window.setTitle("title: " + title);
        window.show();
    }
}