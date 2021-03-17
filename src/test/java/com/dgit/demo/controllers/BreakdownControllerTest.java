package com.dgit.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BreakdownControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void requestBreakdownByStartingLetter_validLowerCase() throws Exception {
        mvc.perform(get("/api/breakdown/startingLetter/m"))
                .andExpect(status().isOk())
                .andExpect(content().string("6"));
    }

    @Test
    void requestBreakdownByStartingLetter_validUpperCase() throws Exception {
        mvc.perform(get("/api/breakdown/startingLetter/M"))
                .andExpect(status().isOk())
                .andExpect(content().string("6"));
    }

    @Test
    void requestBreakdownByStartingLetter_validZero() throws Exception {
        mvc.perform(get("/api/breakdown/startingLetter/a"))
                .andExpect(status().isOk())
                .andExpect(content().string("0"));
    }

    @Test
    void requestBreakdownByMoreLettersThan_valid() throws Exception {
        mvc.perform(get("/api/breakdown/moreLettersThan/3"))
                .andExpect(status().isOk())
                .andExpect(content().string("[\"Move\",\"movie\",\"Marvel\",\"model\",\"magical\",\"mystery\",\"fsdjkldfskjhfsdkj\"]"));
    }

    @Test
    void requestBreakdownByMoreLettersThan_validZero() throws Exception {
        mvc.perform(get("/api/breakdown/moreLettersThan/999"))
                .andExpect(status().isOk())
                .andExpect(content().string("[]"));
    }


}
