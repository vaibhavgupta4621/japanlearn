package com.japanlearn.japanlearn.repository;

import com.japanlearn.japanlearn.model.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {
}