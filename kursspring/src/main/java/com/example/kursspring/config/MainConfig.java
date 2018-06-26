package com.example.kursspring.config;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
//@PropertySource("classpath:castle.properties")
public class MainConfig {

    @Autowired
    Quest quest;

    @Bean(name = "lancelot")
    @Primary
    public Knight lancelot(){
        Knight knight = new Knight("Lancelot", 29);
        knight.setQuest(quest);
        return knight;
    }

    @Bean(name = "percival")
    public Knight createKnightBean(){
        Knight knight = new Knight("Percival", 25);
        knight.setQuest(quest);
        return knight;
    }

}
