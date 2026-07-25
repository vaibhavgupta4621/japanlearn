package com.japanlearn.japanlearn.controller;

import com.japanlearn.japanlearn.model.Vocabulary;
import com.japanlearn.service.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vocabulary")
public class VocabularyController {

    @Autowired
    private VocabularyService vocabularyService;

    @GetMapping
    public List<Vocabulary> getAllWords() {
        return vocabularyService.getAllWords();
    }

    @GetMapping("/random")
    public ResponseEntity<Vocabulary> getRandomWord() {
        Vocabulary word = vocabularyService.getRandomWord();
        if (word == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(word);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Vocabulary> getWordById(@PathVariable Long id) {
        return vocabularyService.getWordById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vocabulary addWord(@RequestBody Vocabulary vocabulary) {
        return vocabularyService.saveWord(vocabulary);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWord(@PathVariable Long id) {
        vocabularyService.deleteWord(id);
        return ResponseEntity.noContent().build();
    }
}
