/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * argumentView.java
 *
 * Created on Dec 5, 2011, 4:34:40 PM
 */
package patterns.observer;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author erik
 */
public class argumentView implements Observer {


    @Override
    /**
     *
     */
    public void update(Observable o, Object arg) {
          // show meegegeven argument
        System.out.println("argumentView: "+arg.toString());

    }
}
