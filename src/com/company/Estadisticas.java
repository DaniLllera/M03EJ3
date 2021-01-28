package com.company;

import java.util.List;

public class Estadisticas {

    private String home_team;
    private String match_date;
    private int player;
    private int minutes_played;
    private int points;

    public Estadisticas(String home_team, String match_date, int player, int minutes_played, int points) {

        this.home_team = home_team;
        this.match_date = match_date;
        this.player = player;
        this.minutes_played = minutes_played;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "home_team='" + home_team + '\'' +
                ", match_date='" + match_date + '\'' +
                ", player=" + player +
                ", minutes_played=" + minutes_played +
                ", points=" + points +
                '}';
    }

    public String getHome_team() {
        return home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team;
    }

    public String getMatch_date() {
        return match_date;
    }

    public void setMatch_date(String match_date) {
        this.match_date = match_date;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public int getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(int minutes_played) {
        this.minutes_played = minutes_played;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
