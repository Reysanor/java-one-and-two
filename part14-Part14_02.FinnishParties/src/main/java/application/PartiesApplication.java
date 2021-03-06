package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class PartiesApplication extends Application {
    static Map<String, Map<Integer,Double>> parsed;
    public static void main(String[] args) {

        launch(PartiesApplication.class);

    }
    @Override
    public void start(Stage stage) {
        Data external = new Data();
        parsed = external.load();
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0,30,5);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");


        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki's, Sharing ranking");


        // the axes and the line chart created previously
          Map<Integer, Double> RKP = new HashMap<>();

          Map<Integer, Double> VIHR = new HashMap<>();


        // data has been read earlier -- the following object contains the data
        //Map<String, Map<Integer, Integer>> values = new HashMap<>();
        Map<String, Map<Integer,Double>> used = parsed;

        // go through the parties and add them to the chart
        used.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            used.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
}
