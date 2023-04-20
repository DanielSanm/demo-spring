package com.projects.demospring.controllers;

import com.projects.demospring.repositories.EmpresaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {

    private EmpresaRepository repository;

    @GetMapping(value = "/{nome}")
    public String exemplo(@PathVariable("nome") String nome) {
        return "Olá " + nome;
    }

}
