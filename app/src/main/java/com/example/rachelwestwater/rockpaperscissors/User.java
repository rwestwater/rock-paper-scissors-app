package com.example.rachelwestwater.rockpaperscissors;

import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;

public class User {
    private ChoiceType choiceType;

    public User(ChoiceType choiceType){
        this.choiceType = choiceType;
    }

    public ChoiceType getChoice() {
        return this.choiceType;
    }
}
