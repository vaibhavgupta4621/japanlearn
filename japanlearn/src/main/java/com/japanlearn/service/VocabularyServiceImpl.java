package com.japanlearn.service;

import com.japanlearn.japanlearn.model.Vocabulary;
import com.repository.VocabularyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class VocabularyServiceImpl implements VocabularyService {

    @Autowired
    private VocabularyRepository vocabularyRepository;

    @Override
    public List<Vocabulary> getAllWords() {
        return vocabularyRepository.findAll();
    }

    @Override
    public Optional<Vocabulary> getWordById(Long id) {
        return vocabularyRepository.findById(id);
    }

    @Override
    public Vocabulary saveWord(Vocabulary vocabulary) {
        return vocabularyRepository.save(vocabulary);
    }

    @Override
    public void deleteWord(Long id) {
        vocabularyRepository.deleteById(id);
    }

    @Override
    public Vocabulary getRandomWord() {
        List<Vocabulary> all = vocabularyRepository.findAll();
        if (all.isEmpty()) return null;
        int index = new Random().nextInt(all.size());
        return all.get(index);
    }
}