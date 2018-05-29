package com.example.rachelwestwater.rockpaperscissors;

import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;

import java.lang.reflect.Array;
import java.util.Random;

public class Android {
    private ChoiceType choiceType;

    public Android(ChoiceType choiceType){
        this.choiceType = choiceType;
    }

    public ChoiceType getChoiceForAndroid() {
            ChoiceType[] moves = ChoiceType.values();
            Random random = new Random();
            int index = random.nextInt(moves.length);
            return moves[index];
        }


}

