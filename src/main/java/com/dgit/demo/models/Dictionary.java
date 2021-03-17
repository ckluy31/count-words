package com.dgit.demo.models;

import java.util.List;

public class Dictionary {

    private final List<Word> wordList;

    public Dictionary(List<Word> inputList) {
        this.wordList = inputList;
    }

    public List<Word> getWordList() {
        return wordList;
    }
}
