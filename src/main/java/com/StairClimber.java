package com;

import java.util.ArrayList;
import java.util.List;

public class StairClimber {

    public Results climbStair(int STAIR_SIZE,
                              int myPosition,
                              ArrayList<String> myWay,
                              Results results,
                              List<Integer> POSSIBLE_STEPS) {

        if (myPosition == STAIR_SIZE) {
            results.addWay(myWay);
            return results;
        }

        if (myPosition > STAIR_SIZE) {
            return results;
        }

        POSSIBLE_STEPS.forEach(nextStep -> {
            ArrayList<String> newWay = createNewWay(myWay);
            newWay.add(String.valueOf(nextStep));
            climbStair(STAIR_SIZE, myPosition + nextStep, newWay, results, POSSIBLE_STEPS);
        });

        return results;
    }


    private ArrayList<String> createNewWay(List<String> myWay) {
        ArrayList<String> newWay = new ArrayList<>();
        myWay.forEach(newWay::add);
        return newWay;
    }
}
