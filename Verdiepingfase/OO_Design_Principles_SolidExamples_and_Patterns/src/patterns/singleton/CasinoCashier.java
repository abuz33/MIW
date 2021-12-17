/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.singleton;

/**
 * construction to make sure 1 and only 1 object is ever constructed.
 * @author erikvanderschriek
 */
public class CasinoCashier {

    // attribuut om de ene unieke instance te bewaren. Allocatie vindt plaats
    // buiten methoden om, zodat er altijd een object is
    // dit heet: eager loading => threadsafe
    private static final CasinoCashier instance = new CasinoCashier();


    /**
     * private constructor
     */
    private CasinoCashier( ) {

    }

    /**
     * speciale methode om maar 1 instance van de klasse terug te geven.
     * Instance moet al bestaan door allocatie aan klasse attribuut.
     * @return 
     */
    public static CasinoCashier getInstance(){
        return instance;
    }
    

}
