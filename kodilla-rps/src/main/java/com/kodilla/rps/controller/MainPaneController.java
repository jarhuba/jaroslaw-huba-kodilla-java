package com.kodilla.rps.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController {

    private String selected = "scissors";

    public String getSelected() {
        return selected;
    }

    @FXML
    private Button paperButton;

    @FXML
    private Button rockButton;

    @FXML
    private Button scissorsButton;

    @FXML
    private Button spockButton;

    @FXML
    private Button lizardButton;

    @FXML
    private Label textPlayer;

    @FXML
    private Label textComputer;

    @FXML
    private ImageView computerPicture;

    @FXML
    private Label textResult;

    @FXML
    private Button nextTurnButton;


    @FXML
    void lizardClicked(ActionEvent event) {
        selected = lizardButton.getText();

    }

    @FXML
    void nextTurnClicked(ActionEvent event) {

    }

    @FXML
    void paperClicked(ActionEvent event) {
        selected = paperButton.getText();
    }

    @FXML
    void rockClicked(ActionEvent event) {
        selected = rockButton.getText();
    }

    @FXML
    void scissorsClicked(ActionEvent event) {
        selected = scissorsButton.getText();
    }

    @FXML
    void spockClicked(ActionEvent event) {
        selected = spockButton.getText();
    }


}
