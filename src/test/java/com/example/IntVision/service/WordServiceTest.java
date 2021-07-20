package com.example.IntVision.service;

import com.example.IntVision.model.Word;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordServiceTest {

    WordService wordService = new WordService();

    @Test
    void shouldReturnCorrectlyAnswerInCase1() throws JsonProcessingException {

        Word input = new Word(List.of("fish","horse","egg","goose","eagle"));

        String expected  = new ObjectMapper().writeValueAsString(new Word(List.of("fish","horse","egg","goose","eagle")));

        Word outPut =  wordService.filtered(input);

        String actual = new ObjectMapper().writeValueAsString(outPut);
        assertEquals(expected,actual);

    }


    @Test
    void shouldReturnCorrectlyAnswerInCase2() throws JsonProcessingException {

        Word input = new Word(List.of("fish","horse","snake","goose","eagle"));

        String expected  = new ObjectMapper().writeValueAsString(new Word(List.of("fish","horse")));

        Word outPut =  wordService.filtered(input);

        String actual = new ObjectMapper().writeValueAsString(outPut);
        assertEquals(expected,actual);

    }

    @Test
    void shouldReturnCorrectlyAnswerInCase3() throws JsonProcessingException {

        Word input = new Word(List.of("fish","horse","","goose","eagle"));

        String expected  = new ObjectMapper().writeValueAsString(new Word(List.of("fish","horse")));

        Word outPut =  wordService.filtered(input);

        String actual = new ObjectMapper().writeValueAsString(outPut);
        assertEquals(expected,actual);

    }


    @Test
    void shouldReturnCorrectlyAnswerInCase4() throws JsonProcessingException {

        Word input = new Word(List.of("","horse","","goose","eagle"));

        String expected  = new ObjectMapper().writeValueAsString(new Word(List.of()));

        Word outPut =  wordService.filtered(input);

        String actual = new ObjectMapper().writeValueAsString(outPut);
        assertEquals(expected,actual);

    }

}