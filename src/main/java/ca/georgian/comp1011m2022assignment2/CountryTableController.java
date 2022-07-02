package ca.georgian.comp1011m2022assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class CountryTableController {

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

    @FXML
    public void handleGraphButtonClick(ActionEvent actionEvent) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("PopulationGraph.fxml"));
        Stage window = (Stage) ViewGraphButton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader, 550, 450));

    }

}
