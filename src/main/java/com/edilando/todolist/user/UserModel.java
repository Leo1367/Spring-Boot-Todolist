package com.edilando.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/* Getters and Setters */
@Data
/* Criando tabela */
@Entity(name = "tabela_users")
public class UserModel {

    /* Informando ao banco de dados que é a chave primaria */
    @Id
    /* Gerando uma ID aleatoria do tipo UUID */
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;

    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
