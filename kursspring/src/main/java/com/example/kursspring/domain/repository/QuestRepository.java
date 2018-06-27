package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Quest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();

    Random rand = new Random();

    public void createQuest(String descryption){
        questList.add(new Quest(descryption));
    }

    public List<Quest> getAll(){
        return questList;
    }

    public void deleteQuest(Quest quest){
        questList.remove(quest);
    }

    @PostConstruct
    public void init(){
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest(){
        List<String> descryptions = new ArrayList<>();

        descryptions.add("Uratuj ksiezniczke");
        descryptions.add("Wez udzial w turnieju");
        descryptions.add("Zabij bande goblinow");
        descryptions.add("Zabij smoka");

        String descryption = descryptions.get(rand.nextInt(descryptions.size()));
        System.out.println("Utworzylem zadnie o opisie: " + descryption);
        createQuest(descryption);


    }
}
