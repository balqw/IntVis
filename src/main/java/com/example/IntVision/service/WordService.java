package com.example.IntVision.service;

import com.example.IntVision.model.Word;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class WordService {

    public Word filtered(Word input){
        Word outPut = new Word();
        List<String> list = new LinkedList<>();

        for(int i=0; i<input.getWords().size()-1;i++){
            String firstWord = input.getWords().get(i);
            String nextWord = input.getWords().get(i+1);
            if(!nextWord.isEmpty()){
                if(firstWord.endsWith(nextWord.substring(0,1))) {
                    if (i == 0) {
                        list.add(firstWord);
                    }
                    list.add(nextWord);
                }
                else
                    break;
            }

        }

        outPut.setWords(list);
        return outPut;
    }


}
