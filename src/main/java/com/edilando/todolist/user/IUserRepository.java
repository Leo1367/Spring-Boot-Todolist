package com.edilando.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/* interface é um modelo dentro da aplicação, seria a implementação dos métodos */
public interface IUserRepository extends JpaRepository<UserModel, UUID> { /* <> é um generator, ou seja, atributos dinâmicos, o primeiro seria a classe que ele tá representando e a segunda é o tipo de id */

    UserModel findByUsername(String username);
    
}
