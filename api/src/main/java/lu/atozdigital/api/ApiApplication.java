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
}
