
import javafx.application.Application;

//http://lauraliparulo.altervista.org/data-science-java-part-2-csv-data-charts/
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class LineChartSample extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart WiFi");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of postal code areas covered");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("WiFi Spots by Borough, 2010");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        
        series.setName("Manhattan");
        //populating the series with data
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(13, 25));
        
        ///to be determined with actuial data from server
        //Function to be Announced later tonight
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Brooklyn");
        series2.getData().add(new XYChart.Data(10, 33));
        series2.getData().add(new XYChart.Data(1, 34));
        series2.getData().add(new XYChart.Data(17, 25));
        series2.getData().add(new XYChart.Data(15, 44));
        series2.getData().add(new XYChart.Data(13, 39));
        series2.getData().add(new XYChart.Data(15, 16));
        series2.getData().add(new XYChart.Data(17, 55));
        series2.getData().add(new XYChart.Data(20, 54));
        series2.getData().add(new XYChart.Data(11, 48));
        series2.getData().add(new XYChart.Data(15, 27));
        series2.getData().add(new XYChart.Data(13, 37));
        series2.getData().add(new XYChart.Data(13, 29));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Queens");
        series3.getData().add(new XYChart.Data(1, 23));
        series3.getData().add(new XYChart.Data(8, 14));
        series3.getData().add(new XYChart.Data(3, 15));
        series3.getData().add(new XYChart.Data(14, 24));
        series3.getData().add(new XYChart.Data(15, 34));
        series3.getData().add(new XYChart.Data(16, 36));
        series3.getData().add(new XYChart.Data(7, 22));
        series3.getData().add(new XYChart.Data(8, 45));
        series3.getData().add(new XYChart.Data(9, 43));
        series3.getData().add(new XYChart.Data(7, 17));
        series3.getData().add(new XYChart.Data(14, 29));
        series3.getData().add(new XYChart.Data(13, 25));

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().addAll(series, series2, series3);
        lineChart.setCreateSymbols(false);
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}


