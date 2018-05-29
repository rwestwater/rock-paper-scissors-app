package com.example.rachelwestwater.rockpaperscissors;
import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;
import com.example.rachelwestwater.rockpaperscissors.enums.ResultType;

public class Game {

    private ChoiceType choiceType;
    private ResultType resultType;
    private int playerScore = 0;
    private int androidScore = 0;
    public int drawScore = 0;

    public static void main(String[] args) {
    }

    public String gameOutcome(ChoiceType userChoice, ChoiceType androidChoice) {
        StringBuilder sb = new StringBuilder();
        if (userChoice == androidChoice) {
            drawScore += 1;
            sb.append("It's a draw!");
        } else if (userChoice.getWinsAgainst() == androidChoice) {
            playerScore += 1;
            sb.append("You win!");
        } else {
            androidScore += 1;
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

    public int getDrawScore() {
        return drawScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getAndroidScore() {
        return androidScore;
    }

    public String getScores(){
        StringBuilder sb = new StringBuilder();
        sb.append("Draws so far: ");
        sb.append(getDrawScore());
        sb.append("\n");
        sb.append("You've won so far: ");
        sb.append(getPlayerScore());
        sb.append("\n");
        sb.append("Android has won: ");
        sb.append(getAndroidScore());
        return sb.toString();
    }
}
