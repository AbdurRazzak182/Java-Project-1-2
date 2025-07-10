package com.app.routinemanagementsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstPageController implements Initializable {

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    Stage stage;

    ObservableList<Table> list= FXCollections.observableArrayList(
            new Table(1,2305100,"hemel","BUET"),
            new Table(2,2305110,"abdur","BUET"),
            new Table(3,2305111,"dipto","BUET"),
            new Table(4,23333,"Sadi","DU")
    );

    @FXML
    private TableView<Table> table;
    @FXML
    private TableColumn<Table, Integer> id;

    @FXML
    private TableColumn<Table, String> name;

    @FXML
    private TableColumn<Table, Integer> serialNumber;

    @FXML
    private TableColumn<Table, String> university;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        serialNumber.setCellValueFactory(new PropertyValueFactory<>("sl"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        university.setCellValueFactory(new PropertyValueFactory<>("varsity_name"));

        table.setItems(list);
    }
}
