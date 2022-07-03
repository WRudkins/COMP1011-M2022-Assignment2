package ca.georgian.comp1011m2022assignment2;

import javafx.fxml.*;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.chart.XYChart;


public class PopulationGraphController implements Initializable {

    @FXML
    private RadioButton ContinentRadioButton;

    @FXML
    private RadioButton CountryRadioButton;

    @FXML
    private RadioButton RegionRadioButton;

    @FXML
    private Button ViewTableButton;

    @FXML
    private BarChart<String, Integer> XYBarChart;

    public void initialize(URL url, ResourceBundle resourcebundle){
        XYChart.Series<String, Integer> series1 = new XYChart.Series();
        series1.setName("Countries");
        series1.getData().add(new XYChart.Data("CHN",1200));
        series1.getData().add(new XYChart.Data("IND",1000));
        series1.getData().add(new XYChart.Data("USA",350));
        series1.getData().add(new XYChart.Data("IDN",270));
        series1.getData().add(new XYChart.Data("BRA",220));

        XYBarChart.getData().addAll(series1);
    }


    @FXML
    private TableColumn<?, ?> CodeCountryTable;

    @FXML
    private TableColumn<?, ?> ContinentCountryTable;

    @FXML
    private TableView<?> CountryTable;

    @FXML
    private TableColumn<?, ?> NameCountryTable;

    @FXML
    private TableColumn<?, ?> PopulationCountryTable;

    @FXML
    private TableColumn<?, ?> RegionCountryTable;

    @FXML
    private Button ViewGraphButton;


    public void handleTableButtonClick(ActionEvent actionEvent) throws IOException {
        SceneManager.Instance().changeScene(actionEvent, "CountryTableController.fxml");
    }

}