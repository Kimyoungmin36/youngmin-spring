package org.kym.jdbc.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ArticleService를 테스트하는 main
 * 
 * @author Jacob
 */
public class ArticleMainUsingSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-jdbc.xml");
		ArticleService articleService = context.getBean("articleService",
				ArticleService.class);
		context.close();

		articleService.addArticle();
		articleService.listArticles();
	}

}