package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0,100,10);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");


        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki's, Sharing ranking");


        // the axes and the line chart created previously
      //  Map<Integer, Double> RKP = new HashMap<>();

      //  Map<Integer, Double> VIHR = new HashMap<>();

        Map<Integer,Integer> ranking = new HashMap<>();
        ranking.put(2007,73);
        ranking.put(2008,68);
        ranking.put(2009,72);
        ranking.put(2010,72);
        ranking.put(2011,74);
        ranking.put(2012,73);
        ranking.put(2013,76);
        ranking.put(2014,73);
        ranking.put(2015,67);
        ranking.put(2016,56);
        ranking.put(2017,56);

        // data has been read earlier -- the following object contains the data
        Map<String, Map<Integer, Integer>> values = new HashMap<>();
        values.put("UOH",ranking);


        // go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
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
