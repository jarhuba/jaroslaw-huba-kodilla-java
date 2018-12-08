package com.kodilla.rps.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class MainPaneController {

    private String selected = "scissors";
    private boolean generalButtonPushed;

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
        generalButtonPushed = true;
    }

    @FXML
    void nextTurnClicked(ActionEvent event) {

    }

    @FXML
    void paperClicked(ActionEvent event) {
        selected = paperButton.getText();
        generalButtonPushed = true;
    }

    @FXML
    void rockClicked(ActionEvent event) {
        selected = rockButton.getText();
        generalButtonPushed = true;
    }

    @FXML
    void scissorsClicked(ActionEvent event) {
        selected = scissorsButton.getText();
        generalButtonPushed = true;
    }

    @FXML
    void spockClicked(ActionEvent event) {
        selected = spockButton.getText();
        generalButtonPushed = true;
    }

    public boolean isGeneralButtonPushed() {
        return generalButtonPushed;
    }

    public void setGeneralButtonPushed(boolean generalButtonPushed) {
        this.generalButtonPushed = generalButtonPushed;
    }
}
