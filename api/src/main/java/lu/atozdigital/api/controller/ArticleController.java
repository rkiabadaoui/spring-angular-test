package main.java.lu.atozdigital.api.controller;

import lu.atozdigital.api.model.Article;
import lu.atozdigital.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/articles/{id}")

    public ResponseEntity<Optional<Article>> getArticleById(@PathVariable  long id){
        Optional<Article> article = articleService.getArticle(id);
        return ResponseEntity.ok(article);
    }
}