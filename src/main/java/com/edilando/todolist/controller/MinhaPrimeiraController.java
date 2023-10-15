package com.edilando.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Quando quer criar uma estrutura com páginas/templates, deve-se utilizar @Controller para retornar não somente um objeto */
/* @Controller */

/* Quando estiver construindo uma API usar @RestController, uma rota (exemplo: http::localhost:8080/------) */
@RequestMapping("/primeiraRota") /* Serve para estruturar a rota */
@RestController
public class MinhaPrimeiraController {

    /*
     * Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Deletar um dado/informação
     * PATCH - Alterar somente uma parte do dado/informação
     */

    /* Método (Funcionalidade) de uma classe */
    @GetMapping("/primeiroMetodo") /* GET */
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
