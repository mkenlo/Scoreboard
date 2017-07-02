package com.mkenlo.scoreboard;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

import static com.mkenlo.scoreboard.R.id.timer;

public class MainActivity extends AppCompatActivity {

    Team team1;
    Team team2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team1 = new Team();
        team2 = new Team();
        Chronometer timer = (Chronometer) findViewById(R.id.timer);
        timer.start();
    }

    /** This method is called when the 3 point button is hit*/
    public void addThreePointTeam1(View buttonView){
        int new_score = team1.getScore() +3;
        team1.setScore(new_score);
        display();

    }
    public void addThreePointTeam2(View buttonView){
        int new_score = team2.getScore() +3;
        team2.setScore(new_score);
        display();
    }

    /** This method is called when the 1 point button is hit*/
    public void addOnePointTeam1(View buttonView){
        int new_score = team1.getScore() +1;
        team1.setScore(new_score);
        display();
    }

    public void addOnePointTeam2(View buttonView){
        int new_score = team2.getScore() +1;
        team2.setScore(new_score);
        display();
    }

    public void addTwoPointTeam1(View buttonView){
        int new_score = team1.getScore() +2;
        team1.setScore(new_score);
        display();
    }
    public void addTwoPointTeam2(View buttonView){
        int new_score = team2.getScore() +2;
        team2.setScore(new_score);
        display();
    }
    public void display(){
        TextView view = (TextView) findViewById(
                R.id.score_team1);
        view.setText("" + team1.getScore());

        view = (TextView) findViewById(
                R.id.score_team2);
        view.setText("" + team2.getScore());

        view = (TextView) findViewById(
                R.id.fouls_team1);
        view.setText("" + team1.getFouls());

        view = (TextView) findViewById(
                R.id.fouls_team2);
        view.setText("" + team2.getFouls());
        
        
    }

    public void incrementFoulsTeam1(View buttonView){
        int fouls = team1.getFouls() + 1;
        team1.setFouls(fouls);
        display();
    }
    public void decrementFoulsTeam1(View buttonView){
        if (team1.getFouls() > 0) {
            int fouls = team1.getFouls() - 1;
            team1.setFouls(fouls);
            display();
        }
    }
    public void incrementFoulsTeam2(View buttonView){
        int fouls = team2.getFouls() + 1;
        team2.setFouls(fouls);
        display();
    }
    public void decrementFoulsTeam2(View buttonView){
        if ( team2.getFouls() > 0) {
            int fouls = team2.getFouls() - 1;
            team2.setFouls(fouls);
            display();
        }
    }

    public void reset(View resetButton){
        team1.setScore(0);
        team2.setScore(0);
        team1.setFouls(0);
        team2.setFouls(0);
        //Chronometer timer = (Chronometer) findViewById(R.id.timer);
        //timer.stop();
        display();
        TextView res_textview = (TextView) findViewById(R.id.result_game);
        res_textview.setText("");
        res_textview.setBackgroundColor(Color.parseColor("#CFD8DC"));

    }

    public void stopGame(View buttonView){
        Chronometer timer = (Chronometer) findViewById(R.id.timer);
        timer.stop();

        TextView res_textview = (TextView) findViewById(R.id.result_game);
        if (team1.getScore() > team2.getScore()){
            res_textview.setText("Winner is TEAM 1");
        }
        else res_textview.setText("Winner is TEAM 2");
        res_textview.setBackgroundColor(Color.parseColor("#9ccc65"));


    }
}
