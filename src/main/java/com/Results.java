package com;

import java.util.ArrayList;

public class Results {

    private ArrayList<ArrayList<String>> possibleWays = new ArrayList<>();

    public void addWay(ArrayList<String> way){
        this.possibleWays.add(way);
    }

    public ArrayList<ArrayList<String>> getPossibleWays() {
        return possibleWays;
    }

    public void setPossibleWays(ArrayList<ArrayList<String>> possibleWays) {
        this.possibleWays = possibleWays;
    }
}


