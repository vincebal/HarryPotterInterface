package com.example.harrypotterinterface;


import example.Main;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.util.Objects;


public class StartController {

    private Stage stage;
    private StartVue startVue;
    private HelloApplication helloApplication;


    public StartController(StartVue startVue, HelloApplication helloApplication) {
        this.startVue = startVue;
        this.startVue.startButton.setOnAction(this::onPlayAction);
    }

    public void onPlayAction(ActionEvent e) {
        Main.start();
    }
}
