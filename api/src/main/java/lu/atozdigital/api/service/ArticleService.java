package main.java.lu.atozdigital.api.service;

import lu.digital.api.model.Article;
import lu.digital.api.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public Article saveArticle(Article article) {
        
        Article savedArticle = articleRepository.save(article);
        return savedArticle;
    }

}