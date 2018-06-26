package com.example.kursspring.services;

import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.repository.KnightRepository;
import com.example.kursspring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    private final static Random rand = new Random();

    public void assignRandomQuest(String knightName){
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(questRepository.getAll().size()));
        knightRepository.getKnight(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);
    }
}
