package ca.georgian.comp1011m2022assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CountryTableController implements Initializable{

    @FXML
    private TableColumn<?, ?> CodeCountryTable;

    @FXML
    private TableColumn<?, ?> ContinentCountryTable;

    @FXML
    private TableView<worldDB> CountryTable;

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

        SceneManager.Instance().changeScene(actionEvent, "PopulationGraph.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //areaCodeComboBox.getItems().add("All");
        //areaCodeComboBox.getItems().add("705");
        CodeCountryTable.setCellValueFactory(new PropertyValueFactory<>("Code"));
        NameCountryTable.setCellValueFactory(new PropertyValueFactory<>("Name"));
        ContinentCountryTable.setCellValueFactory(new PropertyValueFactory<>("Continent"));
        RegionCountryTable.setCellValueFactory(new PropertyValueFactory<>("Region"));
        PopulationCountryTable.setCellValueFactory(new PropertyValueFactory<>("Population"));
        CountryTable.getItems().addAll(DBManager.Instance().readCountryTable());

        //numOfStudentsLabel.setText("Number of Students: ");
    }

}
