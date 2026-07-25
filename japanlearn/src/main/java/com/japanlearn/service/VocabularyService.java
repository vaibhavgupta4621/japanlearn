package com.japanlearn.service;

import com.japanlearn.japanlearn.model.Vocabulary;
import java.util.List;
import java.util.Optional;

public interface VocabularyService {
    List<Vocabulary> getAllWords();
    Optional<Vocabulary> getWordById(Long id);
    Vocabulary saveWord(Vocabulary vocabulary);
    void deleteWord(Long id);
    Vocabulary getRandomWord();
}