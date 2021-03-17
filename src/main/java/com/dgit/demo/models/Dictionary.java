package com.dgit.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    // Dictionary will hold a list of words from the dictionary files

    private final List<Word> wordList;

    public Dictionary() {
        this.wordList = new ArrayList<Word>();
    }

    public void addWord(Word newWord) {
        wordList.add(newWord);
    }

    public List<Word> getWordList() {
        return wordList;
    }
}
