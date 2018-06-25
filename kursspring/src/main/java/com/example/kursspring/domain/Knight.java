package com.example.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Knight {

    private String name;
    private int age;
    private Quest quest;

    public Knight(){

    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Knight(String name, int age){
//        this.name = name;
//        this.age = age;
//    }


    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu: " + name + "(" + age + "). Ma zadanie: " + quest;
    }
}
