package com.dgit.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Breakdown {
    // Breakdown will hold the words that follow a certain business rule

    private final List<Word> breakdownList;

    public Breakdown() {
        this.breakdownList = new ArrayList<Word>();
    }

    public List<Word> getBreakdownList() {
        return breakdownList;
    }

    public int getNumberOfWords() {
        return breakdownList.size();
    }

    public void addWord(Word word) {
        breakdownList.add(word);
    }

}
