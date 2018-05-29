package com.example.rachelwestwater.rockpaperscissors;
import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;
import com.example.rachelwestwater.rockpaperscissors.enums.ResultType;

public class Game {

    private ChoiceType choiceType;
    private ResultType resultType;

    public static void main(String[] args) {
    }

    public String gameOutcome(ChoiceType userChoice, ChoiceType androidChoice) {
        if (userChoice == androidChoice) return "No one wins :( Android selected: " + androidChoice.toString() + " Player selected " + userChoice.toString();
        if (userChoice.getWinsAgainst() == androidChoice) {
            return "Player has won!  Android selected: " + androidChoice.toString() + " Player selected " + userChoice.toString();
        } else {
            return "Android has won!  Android selected: " + androidChoice.toString() + " Player selected " + userChoice.toString();
        }
    }
}
