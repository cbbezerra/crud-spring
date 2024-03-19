package com.loiane.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loiane.model.Curso;
import com.loiane.repository.CursoRepository;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping("/api/cursos")
@AllArgsConstructor

public class CursosController {
    
    private final CursoRepository cursoRepository;

    //@RequestMapping(method = RequestMethod.GET) (necessário importar!)
    @GetMapping
    public List<Curso> list() {
        return cursoRepository.findAll();
    }

}
