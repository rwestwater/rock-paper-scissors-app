package com.example.rachelwestwater.rockpaperscissors;
import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;
import com.example.rachelwestwater.rockpaperscissors.enums.ResultType;

public class Game {

    private User user;
    private Android android;
    private ChoiceType choiceType;
    private ResultType resultType;

    public static void main(String[] args) {
    }

    public ResultType gameOutcome(ChoiceType userChoice, ChoiceType androidChoice) {
        if (userChoice == androidChoice) return resultType.DRAW;
        if (userChoice.getWinsAgainst() == androidChoice) {
            return resultType.WIN;
        } else {
            return resultType.LOSS;
        }
    }
}
