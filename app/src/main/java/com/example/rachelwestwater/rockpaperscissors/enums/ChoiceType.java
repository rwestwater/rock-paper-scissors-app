package com.example.rachelwestwater.rockpaperscissors.enums;

public enum ChoiceType {

    ROCK("SCISSORS"),
    PAPER("ROCK"),
    SCISSORS("PAPER");
    private String winsAgainst;

    ChoiceType(String moveString) {
        this.winsAgainst = moveString;
    }

    public ChoiceType getWinsAgainst() {
        switch (winsAgainst){
            case "SCISSORS":
                return ChoiceType.SCISSORS;
            case "PAPER":
                return ChoiceType.PAPER;
            case "ROCK":
                return ChoiceType.ROCK;
            default:
                return ChoiceType.ROCK;
        }
    }
}
