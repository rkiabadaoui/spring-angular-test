package main.java.lu.atozdigital.api.controller;

import lu.atozdigital.api.model.Article;
import lu.atozdigital.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @PostMapping("/articles")
    
    public Article saveArticle(@RequestBody Article article)
    {
        return articleService.saveArticle(article);

    }
}