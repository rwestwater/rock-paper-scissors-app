package com.example.rachelwestwater.rockpaperscissors;

import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;
import com.example.rachelwestwater.rockpaperscissors.enums.ResultType;

import org.junit.Before;
import org.junit.Test;

import static com.example.rachelwestwater.rockpaperscissors.enums.ResultType.*;
import static org.junit.Assert.assertEquals;

public class GameTest {
    Android android;
    User user;
    Game game;
    private int playerScore = 0;
    private int androidScore = 0;
    private int drawScore = 0;

    @Before
    public void before() {
        game = new Game();
        user = new User(ChoiceType.PAPER);
        android = new Android();
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
        assertEquals("You win!\n" + "Android selected: PAPER\n" + "You selected: SCISSORS", game.gameOutcome(ChoiceType.SCISSORS, ChoiceType.PAPER));
        assertEquals("Android has won!\n" + "Android selected: ROCK\n" + "You selected: SCISSORS", game.gameOutcome(ChoiceType.SCISSORS, ChoiceType.ROCK));
    }

    @Test
    public void RockCanWin(){
        assertEquals("You win!\n" + "Android selected: SCISSORS\n" + "You selected: ROCK", game.gameOutcome(ChoiceType.ROCK, ChoiceType.SCISSORS));
        assertEquals("Android has won!\n" + "Android selected: PAPER\n" + "You selected: ROCK", game.gameOutcome(ChoiceType.ROCK, ChoiceType.PAPER));
    }

    @Test
    public void PaperCanWin(){
        assertEquals("You win!\n" + "Android selected: ROCK\n" + "You selected: PAPER", game.gameOutcome(ChoiceType.PAPER, ChoiceType.ROCK));
        assertEquals("Android has won!\n" + "Android selected: SCISSORS\n" + "You selected: PAPER", game.gameOutcome(ChoiceType.PAPER, ChoiceType.SCISSORS));
    }

    @Test
    public void canGetDrawScore(){
          assertEquals(0, game.getDrawScore());
    }

    @Test
    public void canGetPlayerScore(){
        assertEquals(0, game.getPlayerScore());
    }

    @Test
    public void canGetAndroidScore(){
        assertEquals(0, game.getAndroidScore());
    }

    @Test
    public void canAddToPlayerScore(){
        game.gameOutcome(ChoiceType.PAPER, ChoiceType.ROCK);
        assertEquals(1, game.getPlayerScore());
    }

    @Test
    public void canAddToDrawScore(){
        game.gameOutcome(ChoiceType.ROCK, ChoiceType.ROCK);
        assertEquals(1, game.getDrawScore());
    }

    @Test
    public void canAddToAndroidScore(){
        game.gameOutcome(ChoiceType.PAPER, ChoiceType.SCISSORS);
        assertEquals(1, game.getAndroidScore());
    }



}
