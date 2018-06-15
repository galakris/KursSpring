package com.example.kursspring.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    private String name = "East Watch";

    public Castle()
    {

    }

    @PostConstruct
    public void build()
    {
        System.out.println("Wybudowano zamek " + name);
    }

    @PreDestroy
    public void tearDown()
    {
        System.out.println("Zaraz wyburzymy zamek " + name);
    }
}