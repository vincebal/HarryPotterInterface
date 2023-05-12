package com.example.harrypotterinterface;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class StartVue extends VBox {
    Label titleLabel = new Label("Game Harry Potter");
    Button startButton = new Button("Lancer le jeu !");

    public StartVue() {
        titleLabel.getStyleClass().add("title");
        startButton.getStyleClass().add("btn");
        this.getChildren().addAll(titleLabel, startButton);
    }


}