package com.example.lab1;

import com.example.lab1.model.Counter;
import com.example.lab1.model.Procent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button button;
    @FXML
    private Button button2;
    @FXML
    private Label small_tips_label1;
    @FXML
    private Label small_tips_label2;
    @FXML
    private Label small_tips_label3;
    @FXML
    private Label normal_tips_label1;
    @FXML
    private Label normal_tips_label2;
    @FXML
    private Label normal_tips_label3;
    @FXML
    private Label big_tips_label1;
    @FXML
    private Label big_tips_label2;
    @FXML
    private Label big_tips_label3;
    @FXML
    private TextField textField;


    private  int temp;
    Counter counter = new Counter(0);

    Procent procent = new Procent();
    @FXML
    public void calculate_big_tips(ActionEvent actionEvent) {
        String big_tips_str = textField.getText();
        procent.setSum(Double.valueOf(big_tips_str));
        big_tips_label1.setText("Чаевые 15% "+ String.valueOf(procent.countPr(15)));
        big_tips_label2.setText("Сумма общая "+String.valueOf(procent.countSum(15)));
        big_tips_label3.setText("Сумма окр. "+String.valueOf(procent.countSumTrunc(15)));
    }
    @FXML
    public void calculate_normal_tips(ActionEvent actionEvent) {
        String normal_tips_str = textField.getText();
        procent.setSum(Double.valueOf(normal_tips_str));
        normal_tips_label1.setText("Чаевые 15% "+ String.valueOf(procent.countPr(10)));
        normal_tips_label2.setText("Сумма общая "+String.valueOf(procent.countSum(10)));
        normal_tips_label3.setText("Сумма окр. "+String.valueOf(procent.countSumTrunc(10)));
    }
    @FXML
    public void calculate_small_tips(ActionEvent actionEvent) {
        String small_tips_str = textField.getText();
        procent.setSum(Double.valueOf(small_tips_str));
        small_tips_label1.setText("Чаевые 15% "+ String.valueOf(procent.countPr(5)));
        small_tips_label2.setText("Сумма общая "+String.valueOf(procent.countSum(5)));
        small_tips_label3.setText("Сумма округленная "+String.valueOf(procent.countSumTrunc(15)));
    }
}