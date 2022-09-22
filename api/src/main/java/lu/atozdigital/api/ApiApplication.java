package lu.atozdigital.api;

import lu.atozdigital.api.model.Article;
import lu.atozdigital.api.model.Ordre;
import lu.atozdigital.api.service.ArticleService;
import lu.atozdigital.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class ApiApplication {
	public static void main(String[] args) {

		SpringApplication.run(ApiApplication.class, args);
	}

	@Autowired
	private OrderService orderService;

	@Autowired
	private ArticleService articleService;

@Bean
	CommandLineRunner run() {
		return args -> {

			Article article = new Article(null,"Rkia",100,"BADAOUI",null);
			articleService.saveArticle(article);
			List<Article> articles = new ArrayList<>();
			articles.add(article);
			Ordre order = new Ordre(null,null, null);
			orderService.saveOrder(order);
			Article article_1 = new Article(null,"Rkia",100,"BADAOUI",order);
			articleService.saveArticle(article_1);

		};
	}
}