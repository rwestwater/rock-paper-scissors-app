package com.example.rachelwestwater.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rachelwestwater.rockpaperscissors.enums.ChoiceType;

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView result;
    Game game;
    Android android;
    TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        counter = findViewById(R.id.counter);
        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);
        game = new Game();
        android = new Android();
    }

    public void onRockButtonClicked(View button){
        result.setText(game.gameOutcome(ChoiceType.ROCK, android.getChoiceForAndroid()));
        counter.setText(game.getScores());
    }

    public void onPaperButtonClicked(View button){
        result.setText(game.gameOutcome(ChoiceType.PAPER, android.getChoiceForAndroid()));
        counter.setText(game.getScores());
    }

    public void onScissorsButtonClicked(View button){
        result.setText(game.gameOutcome(ChoiceType.SCISSORS, android.getChoiceForAndroid()));
        counter.setText(game.getScores());
    }



}

