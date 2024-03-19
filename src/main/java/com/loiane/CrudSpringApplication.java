package com.loiane;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.loiane.model.Curso;
import com.loiane.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBASE(CursoRepository cursoRepository) {
		return args -> { 
			cursoRepository.deleteAll();

			Curso c = new Curso();
			c.setNome("Angular com Spring");
			c.setCategoria("front-end");

			cursoRepository.save(c);
		};

	}
}
