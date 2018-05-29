package com.example.rachelwestwater.rockpaperscissors;
import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;
import com.example.rachelwestwater.rockpaperscissors.enums.ResultType;

public class Game {

    private ChoiceType choiceType;
    private ResultType resultType;

    public static void main(String[] args) {
    }

    public String gameOutcome(ChoiceType userChoice, ChoiceType androidChoice) {
        StringBuilder sb = new StringBuilder();
        if (userChoice == androidChoice) {
            sb.append("It's a draw!");
        } else if (userChoice.getWinsAgainst() == androidChoice) {
            sb.append("You win!");
        } else {
            sb.append("Android has won!");
        }

        sb.append("\n");
        sb.append("Android selected: ");
        sb.append(androidChoice.toString());
        sb.append("\n");
        sb.append("You selected: ");
        sb.append(userChoice.toString());
        return sb.toString();
    }
}
