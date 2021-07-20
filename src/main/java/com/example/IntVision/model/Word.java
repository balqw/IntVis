package com.example.IntVision.model;

import java.util.List;

public class Word {
    public Word(List<String> words) {
        this.words = words;
    }

    public Word() {
    }


    private List<String>words;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
