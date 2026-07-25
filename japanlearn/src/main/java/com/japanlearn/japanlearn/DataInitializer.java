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
vocabularyRepository.save(new Vocabulary(null, "おはよう", "ohayou", "good morning", "おはようございます"));
vocabularyRepository.save(new Vocabulary(null, "こんにちは", "konnichiwa", "hello", "こんにちは、元気ですか"));
vocabularyRepository.save(new Vocabulary(null, "こんばんは", "konbanwa", "good evening", "こんばんは！"));
vocabularyRepository.save(new Vocabulary(null, "すみません", "sumimasen", "excuse me", "すみません、トイレはどこですか"));
vocabularyRepository.save(new Vocabulary(null, "だいじょうぶ", "daijoubu", "it's okay", "だいじょうぶですか"));
vocabularyRepository.save(new Vocabulary(null, "たべます", "tabemasu", "to eat", "ごはんをたべます"));
vocabularyRepository.save(new Vocabulary(null, "のみます", "nomimasu", "to drink", "みずをのみます"));
            System.out.println("✅ Sample vocabulary inserted!");
        }
    }
}