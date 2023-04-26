package com.example.bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class BMIController {
    public Button EnglshCheckButton;
    String answer = "";
    private double weight;
    private double height;

    @FXML
    private Button EnglishCheckButton;

    @FXML
    private Button checkButton;

    @FXML
    private TextField checkTextField;

    @FXML
    private TextField englishCheckTextField;

    @FXML
    private Label heightLabel;

    @FXML
    private TextField heightTextField;

    @FXML
    private Label weightLabel;

    @FXML
    private GridPane weightLay;

    @FXML
    private TextField weightTextField;

    @FXML
    void EnglishCheckButton(ActionEvent event) {
        try{

            weight = Double.parseDouble(weightTextField.getText());

            height = Double.parseDouble(heightTextField.getText());

            double value = 703 * (weight/Math.pow(height,2));

            if(value<0){
                throw new NumberFormatException();
            }
            if(value<18.5){
                answer = "Underweight";
            }
            else if(value>=18.5 && value<= 24.99){
                answer = "Normal";
            }
            else if(value>=25 && value<= 29.99){
                answer = "Overweight";
            }
            else{
                answer = "Obese";
            }

            englishCheckTextField.setText(answer);


        }
        catch (NumberFormatException ex){
            weightTextField.setText("Enter Weight");
            heightTextField.setText("Enter Height");
            weightTextField.selectAll();
            weightTextField.requestFocus();
        }


    }

    @FXML
    void checkButton(ActionEvent event) {
        try{

            weight = Double.parseDouble(weightTextField.getText());

            height = Double.parseDouble(heightTextField.getText());

            double value = 1*weight/Math.pow(height,2);

            if(value<0){
                throw new NumberFormatException();
            }
            if(value<18.5){
                answer = "Underweight";
            }
            else if(value>=18.5 && value<= 24.99){
                answer = "Normal";
            }
            else if(value>=25 && value<= 29.99){
                answer = "Overweight";
            }
            else{
                answer = "Obese";
            }

            checkTextField.setText(answer);


        }
        catch (NumberFormatException ex){
            weightTextField.setText("Enter Weight");
            heightTextField.setText("Enter Height");
            weightTextField.selectAll();
            weightTextField.requestFocus();
        }

    }

}
