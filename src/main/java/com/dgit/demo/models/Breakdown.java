package com.dgit.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Breakdown {

    private final List<Word> breakdownList;

    public Breakdown() {
        this.breakdownList = new ArrayList<Word>();
    }

    public List<Word> getBreakdownList() {
        return breakdownList;
    }

    public void addWord(Word word) {
        breakdownList.add(word);
    }
}
