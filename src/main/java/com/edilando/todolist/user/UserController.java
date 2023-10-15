package com.edilando.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

/* 
 * MODIFICADORES
 * public - qualquer um pode acessar
 * private - restrição um pouco maior
 * protected - somente quando estiver na mesma estrutura do pacote
 */

@RestController
@RequestMapping("/users")
public class UserController {

    /* Autowired gerencia todo o ciclo de vida */
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());
        if (user != null) {
            /* Mensagem de erro */
            /* Status code */
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existente.");
        }

        /* primeiro valor seria a força, o cost */
        var passwordHashred = BCrypt.withDefaults()
                .hashToString(12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashred);
        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userCreated);
    }

    @GetMapping("/")
    public UserModel getUserModel() {
        UserModel user = new UserModel();
        return user;
    }
}
