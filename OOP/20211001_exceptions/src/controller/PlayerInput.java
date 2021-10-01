package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerInput {
    private Scanner scanner;

    public PlayerInput() {
        this.scanner = new Scanner(System.in);
    }

    public int vraagOmGetal(String vraag) throws VerkeerdeInputException {
        System.out.println(vraag);
        int getal;
        try{
        getal = scanner.nextInt();
        }
        catch(InputMismatchException ime){
            throw new VerkeerdeInputException("er is foute input",ime);
        }
        return getal;
    }

    public void skipEnter(){
        this.scanner.next();
    }

}
