package model.Voetbalscores;

public class Team {
    String teamNaam;
    int totaalWedstrijdPunten;
    int totaalVoorDoelpunten;
    int totaalTegenDoelpunten;

    public Team() {
        this("", 0, 0, 0);

    }

    public Team(String teamNaam) {
        this(teamNaam, 0, 0, 0);
    }

    public Team(String teamNaam,
                int totaalWedstrijdPunten,
                int totaalVoorDoelpunten,
                int totaalTegenDoelpunten) {
        this.teamNaam = teamNaam;
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public int getTotaalWedstrijdPunten() {
        return totaalWedstrijdPunten;
    }

    public void setTotaalWedstrijdPunten(int totaalWedstrijdPunten) {
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
    }

    public int getTotaalVoorDoelpunten() {
        return totaalVoorDoelpunten;
    }

    public void setTotaalVoorDoelpunten(int totaalVoorDoelpunten) {
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
    }

    public int getTotaalTegenDoelpunten() {
        return totaalTegenDoelpunten;
    }

    public void setTotaalTegenDoelpunten(int totaalTegenDoelpunten) {
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    public int getDoelSaldo() {
        int diff = this.totaalVoorDoelpunten - this.totaalTegenDoelpunten;
        return diff;
    }

    public void printStatusTeam() {
        System.out.printf("The team NAC has %s game point(s) and a goal difference of %s",
                this.totaalWedstrijdPunten, getDoelSaldo());
    }
}
