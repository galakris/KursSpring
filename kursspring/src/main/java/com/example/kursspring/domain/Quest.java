package com.example.kursspring.domain;

public class Quest {
    private String descryption;

    public Quest(String descryption) {
        this.descryption = descryption;
    }

    @Override
    public String toString() {
        return descryption;
    }
}
