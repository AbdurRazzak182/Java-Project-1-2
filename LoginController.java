package com.app.routinemanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    Stage stage;

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;
    boolean val,pass_val;
    @FXML
    private Label  labelShow;

    boolean flag=true;

    




        public void onLogInButtonClick(ActionEvent actionEvent)throws IOException {
                String userName = username.getText();
                String passWord = password.getText();
                boolean val = userName.equals("abdur");
                boolean pass_val = passWord.equals("11223344");

                if (val && pass_val) {
                    labelShow.setText("Log in successful");
                    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("firstPage.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 703, 574);

                    FirstPageController controller = fxmlLoader.getController();
                    controller.setStage(stage);

                    stage.setTitle("first page");
                    stage.setScene(scene);
                    stage.show();

                } else {
                    labelShow.setText("Wrong usename or password");
                    username.clear();
                    password.clear();
                }



    }
}
