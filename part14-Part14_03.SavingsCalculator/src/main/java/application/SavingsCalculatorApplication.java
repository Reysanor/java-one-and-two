package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane = new BorderPane();
        NumberAxis axisX = new NumberAxis(0, 30, 1);
        NumberAxis axisY = new NumberAxis();
        LineChart lineChart = new LineChart(axisX, axisY);
        lineChart.setAnimated(false);
        borderPane.setCenter(lineChart);
        VBox vBox = new VBox();
        borderPane.setTop(vBox);
        BorderPane borderPaneOne = new BorderPane();
        Label monthlySavings = new Label("Monthly savings");
        Slider sliderOne = new Slider(25, 250, 25);
        sliderOne.setShowTickMarks(true);
        sliderOne.setShowTickLabels(true);
        sliderOne.setMajorTickUnit(25);
        sliderOne.setBlockIncrement(10);
        Label sliderOneValue = new Label(String.valueOf(sliderOne.getValue()));
        borderPaneOne.setLeft(monthlySavings);
        borderPaneOne.setCenter(sliderOne);
        borderPaneOne.setRight(sliderOneValue);
        BorderPane borderPaneTwo = new BorderPane();
        Label yearlyInterestRate = new Label("Yearly interest rate");
        Slider sliderTwo = new Slider(0, 10, 1);
       // sliderOne.setShowTickMarks(true);
       // sliderOne.setShowTickLabels(true);
        //sliderOne.setMajorTickUnit(25);
       // sliderOne.setBlockIncrement(10);
        Label sliderTwoValue = new Label(String.valueOf(sliderTwo.getValue()));
        borderPaneTwo.setLeft(yearlyInterestRate);
        borderPaneTwo.setCenter(sliderTwo);
        borderPaneTwo.setRight(sliderTwoValue);
        vBox.getChildren().add(borderPaneOne);
        vBox.getChildren().add(borderPaneTwo);

        Scene view = new Scene(borderPane);
        stage.setScene(view);
        stage.show();
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        // int valueSavings = sliderOneValue.getText();

        sliderOne.valueProperty().addListener((ov, old_val, new_val) -> {
            int value = new_val.intValue();
            sliderOneValue.setText(String.valueOf(new_val.intValue()));
            series.getData().clear();
            lineChart.getData().remove(series);
            for (int i = 0; i < 31; i++) {
                series.getData().add(new XYChart.Data(i, i * value * 12));
            }
            lineChart.getData().add(series);
        });

        sliderTwo.valueProperty().addListener((ov, old_val, new_val) -> {
            double value = new_val.doubleValue()/100.0;
            BigDecimal bd = new BigDecimal(value).setScale(3, RoundingMode.HALF_UP);
            double val2 = bd.doubleValue();
            //System.out.println(val2);
            sliderTwoValue.setText(String.format("%.2f", new_val));
            series2.getData().clear();
            lineChart.getData().remove(series2);
            double savingSum = Double.parseDouble(sliderOneValue.getText())*12.0;
            double current = 0.0;
            series2.getData().add(new XYChart.Data(0 ,0));
            for (int i = 1; i < 31; i++) {
                current = current + savingSum+ ((savingSum+ current) * val2);
                series2.getData().add(new XYChart.Data(i, current));
            }
            lineChart.getData().add(series2);
        });

    }
}
