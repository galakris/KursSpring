package com.example.kursspring.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight, "Castle Black");
        String except = "Znajduje się tu zamek o nazwie Castle Black. Zamieszkały przec rycerza: Rycerz o imieniu: Lancelot(29). Ma zadanie: Uratuj Księżniczkę";
        assertEquals(except, castle.toString());
    }
}
