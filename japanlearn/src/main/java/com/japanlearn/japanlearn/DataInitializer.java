package com.japanlearn.japanlearn;

import com.japanlearn.japanlearn.model.Vocabulary;
import com.repository.VocabularyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private VocabularyRepository vocabularyRepository;

    @Override
    public void run(String... args) throws Exception {
        if (vocabularyRepository.count() == 0) {
            vocabularyRepository.save(new Vocabulary(null, "ありがとう", "arigatou", "thank you", "ありがとうございます"));
            vocabularyRepository.save(new Vocabulary(null, "はじめまして", "hajimemashite", "nice to meet you", "はじめまして、バイブです"));
            vocabularyRepository.save(new Vocabulary(null, "わかりました", "wakarimashita", "I understand", "はい、わかりました"));
            System.out.println("✅ Sample vocabulary inserted!");
        }
    }
}