package com.dgit.demo.services;

import com.dgit.demo.models.Breakdown;
import com.dgit.demo.models.Dictionary;
import com.dgit.demo.models.Word;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class BreakdownService {

    public Dictionary readDictionary(String filename) {
        // this function will read the words of a file and add it to its own dictionary object

        Dictionary dictionary = new Dictionary();

        // retrieve all the words in the file based dictionary
        String fileLocation = "./src/main/resources/data/" + filename + ".txt";

        try {
            // Open the file
            FileInputStream fstream = new FileInputStream(fileLocation);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;

            // read every line
            while ((strLine = br.readLine()) != null) {

                // add each word to the dictionary
                Word thisWord = new Word(strLine);
                dictionary.addWord(thisWord);

            }

            // close input stream
            fstream.close();
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }

        return dictionary;
    }

    public Breakdown getBreakdownByStartingLetter(char letter, String dictionaryFile) {
        Dictionary dictionary;
        dictionary = readDictionary(dictionaryFile);

        // retrieve list of words from the dictionary
        List<Word> listWords = dictionary.getWordList();

        Breakdown breakdownByStartingLetter = new Breakdown();

        // iterate through all the words
        for(Word word:listWords) {
            if(word.startsWithLetter('m')) {
                // add word to the breakdown if valid
                breakdownByStartingLetter.addWord(word);
            }
        }
        return breakdownByStartingLetter;
    }

}
