package com.example.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tournament {

    @Autowired
    @Qualifier("percival")
    Knight knight;

    public Tournament(){

    }

    public void duel() {
        knight.setAge(knight.getAge()+1);
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }

    @Override
    public String toString(){
        return "W turnieju bierze udział: " + knight;
    }
}