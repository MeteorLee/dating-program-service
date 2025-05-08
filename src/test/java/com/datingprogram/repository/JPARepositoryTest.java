package com.datingprogram.repository;

import com.datingprogram.config.JpaConfig;
import com.datingprogram.domain.Article;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@Transactional
@DataJpaTest
@ActiveProfiles("test")
class JPARepositoryTest {

    private final ArticleRepository articleRepository;

    @Autowired
    public JPARepositoryTest(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Test
    void givenNone_whenSelecting_thenWorksFine() {
        // Given


        // When
        List<Article> articles = articleRepository.findAll();

        // Then
        assertThat(articles).isEmpty();

    }
}