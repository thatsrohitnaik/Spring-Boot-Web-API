package com.example.rest.model;

import java.util.Objects;

public class Table {
    String club = null;
    int played = 0;
    int won = 0;
    int lost = 0;
    int points = 0;

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return played == table.played &&
                won == table.won &&
                lost == table.lost &&
                points == table.points &&
                Objects.equals(club, table.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club, played, won, lost, points);
    }
}
