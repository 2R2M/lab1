package com.example.lab1.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Counter {
    private int count;
    public Counter(int start)
    {
        count = start;
    }

       public int getCount()
       {
           return  count;
       }

    public void setCount(int count) {
        this.count = count;
    }
}