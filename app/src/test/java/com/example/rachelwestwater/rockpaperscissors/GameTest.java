package com.example.rachelwestwater.rockpaperscissors;

import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;
import com.example.rachelwestwater.rockpaperscissors.enums.ResultType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Android android;
    User user;
    Game game;

    @Before
    public void before() {
        game = new Game();
        user = new User(ChoiceType.PAPER);
        android = new Android(ChoiceType.ROCK);
    }

    @Test
    public void canGetChoice() {
        assertEquals(ChoiceType.PAPER, user.getChoice());
    }

    @Test
    public void canGetChoiceForAndroid() {
        assertEquals(ChoiceType.PAPER, android.getChoiceForAndroid());
    }

    @Test
    public void ScissorsCanWin(){
        assertEquals(ResultType.WIN, game.gameOutcome(ChoiceType.SCISSORS, ChoiceType.PAPER));
        assertEquals(ResultType.LOSS, game.gameOutcome(ChoiceType.SCISSORS, ChoiceType.ROCK));
    }

    @Test
    public void RockCanWin(){
        assertEquals(ResultType.WIN, game.gameOutcome(ChoiceType.ROCK, ChoiceType.SCISSORS));
        assertEquals(ResultType.LOSS, game.gameOutcome(ChoiceType.ROCK, ChoiceType.PAPER));
    }

    @Test
    public void PaperCanWin(){
        assertEquals(ResultType.WIN, game.gameOutcome(ChoiceType.PAPER, ChoiceType.ROCK));
        assertEquals(ResultType.LOSS, game.gameOutcome(ChoiceType.PAPER, ChoiceType.SCISSORS));
    }


}
