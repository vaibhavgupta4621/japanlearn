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
           vocabularyRepository.save(new Vocabulary(null, "いきます", "ikimasu", "to go", "がっこうにいきます"));
vocabularyRepository.save(new Vocabulary(null, "きます", "kimasu", "to come", "ともだちがきます"));
vocabularyRepository.save(new Vocabulary(null, "みます", "mimasu", "to see/watch", "テレビをみます"));
vocabularyRepository.save(new Vocabulary(null, "ききます", "kikimasu", "to listen", "おんがくをききます"));
vocabularyRepository.save(new Vocabulary(null, "よみます", "yomimasu", "to read", "ほんをよみます"));
vocabularyRepository.save(new Vocabulary(null, "かきます", "kakimasu", "to write", "てがみをかきます"));
vocabularyRepository.save(new Vocabulary(null, "かいます", "kaimasu", "to buy", "くだものをかいます"));
vocabularyRepository.save(new Vocabulary(null, "おきます", "okimasu", "to wake up", "しちじにおきます"));
vocabularyRepository.save(new Vocabulary(null, "ねます", "nemasu", "to sleep", "じゅういちじにねます"));
vocabularyRepository.save(new Vocabulary(null, "でんわ", "denwa", "telephone", "でんわをかけます"));
vocabularyRepository.save(new Vocabulary(null, "がっこう", "gakkou", "school", "がっこうにいきます"));
vocabularyRepository.save(new Vocabulary(null, "しごと", "shigoto", "work/job", "しごとがすきです"));
vocabularyRepository.save(new Vocabulary(null, "おかね", "okane", "money", "おかねがあります"));
vocabularyRepository.save(new Vocabulary(null, "じかん", "jikan", "time", "じかんがありません"));
vocabularyRepository.save(new Vocabulary(null, "ともだち", "tomodachi", "friend", "ともだちとあそびます"));
vocabularyRepository.save(new Vocabulary(null, "かぞく", "kazoku", "family", "かぞくがすきです"));
vocabularyRepository.save(new Vocabulary(null, "くるま", "kuruma", "car", "くるまでいきます"));
vocabularyRepository.save(new Vocabulary(null, "でんしゃ", "densha", "train", "でんしゃにのります"));
vocabularyRepository.save(new Vocabulary(null, "みず", "mizu", "water", "みずをのみます"));
vocabularyRepository.save(new Vocabulary(null, "たべもの", "tabemono", "food", "たべものがすきです"));
            System.out.println("✅ Sample vocabulary inserted!");
        }
    }
}