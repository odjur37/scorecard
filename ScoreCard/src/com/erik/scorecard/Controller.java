package com.erik.scorecard;

import com.erik.scorecard.datamodel.Hole;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;

public class Controller {
    private Hole hole;

    @FXML
    private Slider scoreSlider;
    @FXML
    private CheckBox fairwayBox;
    @FXML
    private CheckBox greenBox;
    @FXML
    private Slider puttSlider;
    @FXML
    private CheckBox upndBox;

    public void initialize(){

        hole = new Hole();

        scoreSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (oldValue.intValue() != newValue.intValue()){
                    updateScore(newValue.intValue());
                }
            }
        });

        puttSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (oldValue.intValue() != newValue.intValue()){
                    updatePutts(newValue.intValue());
                }
            }
        });
    }

    public void updateFairway(){
        if (fairwayBox.isSelected()){
            hole.setFairway(true);
        } else {
            hole.setFairway(false);
        }
        System.out.println("Updated fw: " + fairwayBox.isSelected());
    }

    public void updateGreen(){
        if (greenBox.isSelected()){
            hole.setGreen(true);
        } else {
            hole.setGreen(false);
        }
        System.out.println("Updated green: " + greenBox.isSelected());
    }

    private void updateScore(int newValue){
        hole.setScore(newValue);
        System.out.println("Updated score: " + newValue);
    }

    private void updatePutts(int newValue){
        hole.setPutts(newValue);
        System.out.println("Updated putts: " + newValue);
    }

    public void updateUpnd(){
        if (upndBox.isSelected()){
            hole.setUpnd(true);
        } else {
            hole.setUpnd(false);
        }
        System.out.println("Updated UPND: " + fairwayBox.isSelected());
    }
}
