package com.erik.scorecard.datamodel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Round {

    private ArrayList<Hole> holes;
    private LocalDate dateOfRound;

    public Round() {
    }

    public boolean addHole(Hole hole){
        return holes.add(hole);
    }
}
