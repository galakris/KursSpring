package com.example.kursspring.domain;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Quest {
    private String descryption;

    public Quest() {
        this.descryption = "Uratuj Księżniczkę";
    }

    @Override
    public String toString() {
        return descryption;
    }
}
