package com.kodilla.rps.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {

    @FXML
    private Button papreButton;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {




    }
}
