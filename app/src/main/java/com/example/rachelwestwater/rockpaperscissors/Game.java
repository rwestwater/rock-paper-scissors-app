package com.example.rachelwestwater.rockpaperscissors;
import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;
import com.example.rachelwestwater.rockpaperscissors.enums.ResultType;

public class Game {

    private ChoiceType choiceType;
    private ResultType resultType;
    private int player_score = 0;
    private int android_score = 0;
    private int draw_score = 0;

    public static void main(String[] args) {
    }

    public String gameOutcome(ChoiceType userChoice, ChoiceType androidChoice) {
        StringBuilder sb = new StringBuilder();
        if (userChoice == androidChoice) {
            draw_score ++;
            sb.append("It's a draw!");
        } else if (userChoice.getWinsAgainst() == androidChoice) {
            player_score ++;
            sb.append("You win!");
        } else {
            android_score ++;
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
