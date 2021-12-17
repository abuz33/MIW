/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.observer;

import java.util.Observable;

/**
 *
 * @author erik
 */
public class Dobbelsteen extends Observable{
    private int ogen;

    public Dobbelsteen() {
        this.ogen = this.randomIntWaardeMetGrenzen(1, 6);
        this.setChanged();
        this.notifyObservers(this.ogen);
    }
    
    public void gooi(){
        this.ogen = this.randomIntWaardeMetGrenzen(1, 6);
        this.setChanged();
        this.notifyObservers(this.ogen);
    }

    public int getOgen() {
        return ogen;
    }
    
    
    /**
     * deze methode returned een random in waarde tussen en inclusief de gegeven grenzen.
     * minimum <= maximum.
     * @param minimum minimale waarde die gereturned kan worden. 
     * @param maximum maximale waarde die gereturned kan worden.
     * @return 
     */
    private int randomIntWaardeMetGrenzen(int minimum, int maximum){
        int returnvalue = minimum;
        // bepaal random waarde [0..1)
        double randomDouble = Math.random();
        
        // schaal tot [0..(maximum-minimum))
        randomDouble = randomDouble * (maximum - minimum);
        
        // rond af tot [0..(maximum-minimum)]
        long randomLong = Math.round(randomDouble);
        
        // schuif op tot [minimum..(maximum-minimum)]
        randomLong = minimum + randomLong;
        
        // cast naar int
        returnvalue = (int)randomLong;
        
        return returnvalue;
        
    }
}
