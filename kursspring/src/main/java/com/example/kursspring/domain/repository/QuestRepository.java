package com.example.kursspring.domain.repository;

import com.example.kursspring.domain.Quest;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();

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
        createQuest("Uratuj księżniczkę");
        createQuest("Weź udział w turnieju");
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
