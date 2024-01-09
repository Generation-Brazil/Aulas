package br.org.generation.BlogPessoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class BlogPessoalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BlogPessoalApplication.class, args);
	}
}
