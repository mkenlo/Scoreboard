package com.mkenlo.scoreboard;

/**
 * Created by Melanie on 7/1/2017.
 */

public class Team {
    private String name;
    private int score;
    private int fouls;

    public Team() {
        this.score = 0;
        this.fouls = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }


}
