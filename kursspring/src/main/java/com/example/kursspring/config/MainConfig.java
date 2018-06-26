package com.example.kursspring.config;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@PropertySource("classpath:castle.properties")
public class MainConfig {

//    @Autowired
//    Quest quest;
//
//    @Bean
//    @Scope("prototype")
//    public Knight knight(){
//        Knight knight = new Knight("Lancelot", 29);
//        knight.setQuest(quest);
//        return knight;
//    }

}
