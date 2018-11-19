package com.erik.scorecard;

import com.erik.scorecard.datamodel.Hole;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import java.util.HashMap;

public class Controller {

    private HashMap<Integer, Hole> holes;
    private Hole currentHole;

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

        this.holes = new HashMap<>();
        for (int i = 1 ; i <= 18; i++){
            holes.put(i, new Hole(i));
        }
        System.out.println(holes.size());
        this.currentHole = holes.get(1);

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
            currentHole.setFairway(true);
        } else {
            currentHole.setFairway(false);
        }
        System.out.println("Updated fw: " + fairwayBox.isSelected());
    }

    public void updateGreen(){
        if (greenBox.isSelected()){
            currentHole.setGreen(true);
        } else {
            currentHole.setGreen(false);
        }
        System.out.println("Updated green: " + greenBox.isSelected());
    }

    private void updateScore(int newValue){
        currentHole.setScore(newValue);
        System.out.println("Updated score: " + newValue);
    }

    private void updatePutts(int newValue){
        currentHole.setPutts(newValue);
        System.out.println("Updated putts: " + newValue);
    }

    public void updateUpnd(){
        if (upndBox.isSelected()){
            currentHole.setUpnd(true);
        } else {
            currentHole.setUpnd(false);
        }
        System.out.println("Updated UPND: " + upndBox.isSelected());
    }

    public void nextHole(){
        if (currentHole.getHoleNo() != 18) {
            currentHole = holes.get(currentHole.getHoleNo() + 1);
            updateUI();
            System.out.println("Switched to hole " + currentHole.getHoleNo() + "!");
        } else {

        }
    }

    public void previousHole(){
        if (currentHole.getHoleNo() != 1){
            currentHole = holes.get(currentHole.getHoleNo() + - 1);
            updateUI();
            System.out.println("Switched to hole " + currentHole.getHoleNo() + "!");
        }
    }

    public void updateUI(){
        scoreSlider.setValue(currentHole.getScore());
        fairwayBox.setSelected(currentHole.isFairway());
        greenBox.setSelected(currentHole.isGreen());
        puttSlider.setValue(currentHole.getPutts());
        upndBox.setSelected(currentHole.isUpnd());
    }
}
