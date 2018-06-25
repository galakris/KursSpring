package com.example.kursspring.config;

import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config/castle-config.xml")
public class MainConfig {

    @Bean
    public Quest createQuest(){
        return new Quest();
    }

    @Bean
    public Knight knight(){
        Knight knight = new Knight("Lancelot", 29);
        knight.setQuest(createQuest());
        return knight;
    }
}
