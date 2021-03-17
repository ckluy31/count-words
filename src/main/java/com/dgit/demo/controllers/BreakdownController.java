package com.dgit.demo.controllers;

import com.dgit.demo.models.Breakdown;
import com.dgit.demo.services.BreakdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreakdownController {
    private final BreakdownService breakdownService;
    private final String defaultDict;

    @Autowired
    public BreakdownController(BreakdownService breakdownService) {
        this.breakdownService = breakdownService;
        this.defaultDict = "dictionary1";
    }

    @RequestMapping(path = "/api/breakdown/startingLetter/{letter}")
    public int getNumberWordsStartingWith(@PathVariable char letter)  {
        Breakdown breakdownByStartingLetter = breakdownService.getBreakdownByStartingLetter(letter, defaultDict);
        return breakdownByStartingLetter.getNumberOfWords();
    }
}
