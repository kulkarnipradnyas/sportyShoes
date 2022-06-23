package com.simplilearn.sportyshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.simplilearn")

@EntityScan("com.simplilearn.sportyshoes.model")
@EnableJpaRepositories("com.simplilearn.sportyshoes.dao")
@SpringBootApplication
public class EPortalSportyShoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EPortalSportyShoesApplication.class, args);
	}

}
