package ticTacToe;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;


public class TicTacToeApplication extends Application {
    String turnSymbol = "X";
    Label turnInfo = new Label("Turn: X");
    ArrayList<Button> buttons = new ArrayList<>();

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane = new BorderPane();

        turnInfo.setFont(Font.font("Monospaced", 40));
        borderPane.setTop(turnInfo);

        GridPane gridPane = new GridPane();
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        for (int i = 0; i < 9; i++) {
            buttons.add(new Button());
            buttons.get(i).setFont(Font.font("Monospaced", 40));
            buttons.get(i).setPrefSize(80, 80);
            int temp = i;
            buttons.get(temp).setOnAction((event) -> {
                checker(temp);
            });

        }
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gridPane.add(buttons.get(counter), j, i);
                counter++;
            }
        }


        borderPane.setCenter(gridPane);
        Scene view = new Scene(borderPane);
        stage.setScene(view);
        stage.show();

    }

    private void checker(int button) {
        if (buttons.get(button).getText().isBlank()) {
            if (turnSymbol.equals("X")) {
                buttons.get(button).setText("X");
                turnSymbol = "O";
                turnInfo.setText("Turn: O");

            }else if (turnSymbol.equals("O")) {
                buttons.get(button).setText("O");
                turnSymbol = "X";
                turnInfo.setText("Turn: X");
            }
        }
        gameOver();
    }

    private void gameOver(){
        sameSymbols(buttons.get(0).getText(),buttons.get(1).getText(),buttons.get(2).getText());
        sameSymbols(buttons.get(3).getText(),buttons.get(4).getText(),buttons.get(5).getText());
        sameSymbols(buttons.get(6).getText(),buttons.get(7).getText(),buttons.get(8).getText());
        sameSymbols(buttons.get(0).getText(),buttons.get(3).getText(),buttons.get(6).getText());
        sameSymbols(buttons.get(1).getText(),buttons.get(4).getText(),buttons.get(7).getText());
        sameSymbols(buttons.get(2).getText(),buttons.get(5).getText(),buttons.get(8).getText());
        sameSymbols(buttons.get(0).getText(),buttons.get(4).getText(),buttons.get(8).getText());
        sameSymbols(buttons.get(0).getText(),buttons.get(4).getText(),buttons.get(6).getText());

    }

    private void sameSymbols(String one, String two, String three) {
        if (one.equals(two) && one.equals(three) && one.equals("X") || one.equals(two) && one.equals(three) && one.equals("O")){
            turnInfo.setText( "The end!");
            for(Button b: buttons) b.setDisable(true);
        }
    }

}
