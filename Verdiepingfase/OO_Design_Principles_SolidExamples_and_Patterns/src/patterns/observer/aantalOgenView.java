/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * aantalOgenView.java
 *
 * Created on Dec 5, 2011, 4:33:54 PM
 */
package patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author erik
 */
public class aantalOgenView implements Observer{


    @Override
    /**
     *
     */
    public void update(Observable o, Object arg) {
        // cast observable o naar juiste type (hiervoor moet je dus weten dat het model
        // van type 'Dobbelsteen' is. Toch nog (te)veel koppeling tussen onderdelen
        Dobbelsteen d = (Dobbelsteen) o;
        System.out.println("aantalOgenView: aantal ogen is: "+d.getOgen());

        
    }
}
