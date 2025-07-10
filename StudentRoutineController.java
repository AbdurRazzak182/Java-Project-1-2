package com.app.routinemanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

//import files for date update

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class StudentRoutineController implements Initializable{

    @FXML
    private TableColumn<?, ?> day;

    @FXML
    private TableColumn<?, ?> eleven_12;

    @FXML
    private TableColumn<?, ?> four_5;

    @FXML
    private Label level;

    @FXML
    private TableColumn<?, ?> nine_ten;

    @FXML
    private TableColumn<?, ?> one_2;

    @FXML
    private Label sId;

    @FXML
    private Label setVarsityName;

    @FXML
    private Label studentName;

    @FXML
    private TableColumn<?, ?> ten_11;

    @FXML
    private Label term;

    @FXML
    private TableColumn<?, ?> three_4;

    @FXML
    private TableColumn<?, ?> twelve_1;

    @FXML
    private TableColumn<?, ?> two_3;

//    for updating data

    @FXML
    private Label dateLabel;

    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.ENGLISH);

    private LocalDate lastDate = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateDate(); // Set initial date

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(60), e -> checkDateUpdate()) // check every 60 sec
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void updateDate() {
        lastDate = LocalDate.now();
        dateLabel.setText(lastDate.format(formatter));
    }

    private void checkDateUpdate() {
        LocalDate currentDate = LocalDate.now();
        if (!currentDate.equals(lastDate)) {
            updateDate(); // date changed, update label
        }
    }

    // start button event

    @FXML
    void onClassRoutineButton(ActionEvent event) {

    }

    @FXML
    void onExamRoutineButton(ActionEvent event) {

    }

}
