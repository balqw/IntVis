package com.example.IntVision.controller;

import com.example.IntVision.model.Word;
import com.example.IntVision.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WordController {

    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping
    public Word game(@RequestBody Word input){
        return wordService.filtered(input);
    }
}
