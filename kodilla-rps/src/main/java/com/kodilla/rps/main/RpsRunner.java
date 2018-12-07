package com.kodilla.rps.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RpsRunner extends Application {

    public static void main(String[] args) {

        System.out.println("Gra w papier, kamień, nożyce");
        System.out.println("ver. 0.01 " + "initial attempt");
        launch(args);
        boolean end = false;

        Player computer = new Player(false, "Deep Thought Computer");
        Player human = new Player(true, "Dwukwiat");
        human.setRps("paper");

        Logic logic = new Logic(computer, human);
        Player winner = logic.matchWinner();
        System.out.println("And the winner is... " + winner.getName());

        //brak wprowadzania danych, opcji wyboru przez wchile(!end) itd

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
    }
}
