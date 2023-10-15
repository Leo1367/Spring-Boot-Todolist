package com.edilando.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @ se chama anotation, uma interface que executa alguma coisa, ou seja, tem uma função por trás dela que o Spring consegue identificar, nesse caso de SpringBootApplication ela define que é a classe principal da aplicação

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}