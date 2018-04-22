package com.example.prasanga.lets_cheer;

import java.io.Serializable;

/**
 * Created by prasanga on 4/19/18.
 */

public class Match_layout_model implements Serializable{
    private String date,league_title;
    private int score_team1,score_team2;
    private int team_logo1,team_logo2;

    public Match_layout_model(String date, String league_title, int score_team1, int score_team2, int team_logo1, int team_logo2) {
        this.date = date;
        this.league_title = league_title;
        this.score_team1 = score_team1;
        this.score_team2 = score_team2;
        this.team_logo1 = team_logo1;
        this.team_logo2 = team_logo2;
    }

    public String getDate() {
        return date;
    }

    public String getLeague_title() {
        return league_title;
    }

    public int getScore_team1() {
        return score_team1;
    }

    public int getScore_team2() {
        return score_team2;
    }

    public int getTeam_logo1() {
        return team_logo1;
    }

    public int getTeam_logo2() {
        return team_logo2;
    }
}
