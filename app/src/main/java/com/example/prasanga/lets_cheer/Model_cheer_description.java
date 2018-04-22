package com.example.prasanga.lets_cheer;

/**
 * Created by prasanga on 4/21/18.
 */

public class Model_cheer_description {
    private String teamName;
    private int followers_count,cheers_count,team_score;
    private int team_banner;

    public Model_cheer_description(String teamName, int followers_count, int cheers_count, int team_score, int team_banner) {
        this.teamName = teamName;
        this.followers_count = followers_count;
        this.cheers_count = cheers_count;
        this.team_score = team_score;
        this.team_banner = team_banner;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public int getCheers_count() {
        return cheers_count;
    }

    public int getTeam_score() {
        return team_score;
    }

    public int getTeam_banner() {
        return team_banner;
    }


}
