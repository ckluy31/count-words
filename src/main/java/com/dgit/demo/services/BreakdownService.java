package com.dgit.demo.services;

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
    public List<Word> readDictionary(String filename) throws IOException {
        Dictionary dictionary;
        List<Word> listWords = new ArrayList<Word>();
        // retrieve all the words in the file based dictionary
        String fileLocation = "./src/main/resources/data/" + filename + ".txt";
        // Open the file
        FileInputStream fstream = new FileInputStream(fileLocation);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        // read every line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            System.out.println (strLine);
        }

        // close input stream
        fstream.close();

        return listWords;
    }
}
