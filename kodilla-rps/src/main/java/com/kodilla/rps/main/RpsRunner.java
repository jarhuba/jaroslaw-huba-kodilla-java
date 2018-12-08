package com.kodilla.rps.main;

import com.kodilla.rps.controller.MainPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class RpsRunner extends Application {

    public static void main(String[] args) {

        System.out.println("Gra w papier, kamień, nożyczki, spock, jaszczurka");
        System.out.println("ver. 0.01 " + "initial attempt");
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/MainPane.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("RPS");
        primaryStage.show();

        Human human = new Human();
        Computer computer = new Computer();
        MainPaneController controller = new MainPaneController();
        Logic logic = new Logic(human, computer);

        boolean end = false;

        while (!end) {
            if (controller.isGeneralButtonPushed() == true) {
                human.setRps(controller.getSelected());
                computer.setRps();
                System.out.println(logic.resoult());
                controller.setGeneralButtonPushed(false);
            } else {
                // oczekiwanie na akcję użytkownika
                return;
            }
        }
    }
}
