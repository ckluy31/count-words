package com.dgit.demo.models;

public class Word {
    // Word will represent a single word

    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public boolean startsWithLetter(char letter) {
        // this function returns true if words starts with capitalised or uncapitalised letter
        return word.charAt(0) == Character.toLowerCase(letter) || word.charAt(0) == Character.toUpperCase(letter);
    }

    public int getWordLength() {
        return word.length();
    }
}
