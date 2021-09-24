package kofferslot;

public class Kofferslot {
    char eersteLetter;
    char tweedeLetter;
    int cijfer;

    public Kofferslot() {
        this('A', 'A', 0);
    }

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        this.eersteLetter = eersteLetter;
        this.tweedeLetter = tweedeLetter;
        this.cijfer = cijfer;
    }

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
        setEersteLetter(eersteLetter);
        setTweedeLetter(tweedeLetter);
        setCijfer(cijfer);
    }

    private char volgendeLetter(char letter) {
        if (letter == 'Z') letter = 'A';
        else letter += 1;
        return letter;
    }

    private int volgendeCijfer(int cijfer) {
        if (cijfer == 9) return 0;
        return cijfer + 1;
    }

    public void volgende() {
        if (this.cijfer == 9) {
            if (this.tweedeLetter == 'Z') {
                setEersteLetter(volgendeLetter(this.eersteLetter));
            }
            setTweedeLetter(volgendeLetter(this.tweedeLetter));
        }
        setCijfer(volgendeCijfer(this.cijfer));

        System.out.printf("%s%s%s", this.eersteLetter, this.tweedeLetter, this.cijfer);
        System.out.println();
    }

    public void setEersteLetter(char eersteLetter) {
        this.eersteLetter = eersteLetter;
    }

    public void setTweedeLetter(char tweedeLetter) {
        this.tweedeLetter = tweedeLetter;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

}
