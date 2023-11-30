package com.jpa.jpaexample.controller;

import com.jpa.jpaexample.repostiory.CrudEntityRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class CrudController {
    private final CrudEntityRepository crudEntityRepository;

    @PersistenceContext
    private EntityManager entityManager;



}
