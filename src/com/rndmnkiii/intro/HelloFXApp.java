/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rndmnkiii.intro;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloFXApp extends Application {
    //Really not necessary to include main method
    public static void main(String[] args){
        //Launch the JavaFX app
        Application.launch(args);
    }
    @Override
    public void start(Stage stage){
        //set a title for the stage
        stage.setTitle("Hola Aplicación JavaFX");
        
        //show the stage
        stage.show();
    }
}