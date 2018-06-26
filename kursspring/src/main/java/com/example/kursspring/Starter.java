package com.example.kursspring;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Autowired
    Tournament tournament;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);
        System.out.println(tournament);
        tournament.duel();
        System.out.println(castle);
        System.out.println(tournament);
    }
}
