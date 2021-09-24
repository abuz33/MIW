package Voetbalscores;

import model.Team;

public class Wedstrijd2 {
    Team teamThuis;
    Team teamUit;
    int voorDoelpunten;
    int tegenDoelpunten;

    public Wedstrijd2() {
    }

    public Wedstrijd2(Team teamThuis, Team teamUit) {
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
    }

    public Wedstrijd2(Team teamThuis, Team teamUit, int voorDoelpunten, int tegenDoelpunten) {
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public int getWedstrijdThuisTeam() {
        return -1;
    }

    public int getWedstrijdUitTeam() {
        return -1;
    }

    public void setWedstrijdThuisTeam() {
    }

    public void setWedstrijdUitTeam() {
    }

    public void setTotaalDoelpuntenTeams() {
    }

    public void printUitslag() {
    }
}
