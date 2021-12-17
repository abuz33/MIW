/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.facade.solution;

import patterns.facade.*;
import patterns.facade.solution.HomeTheaterInterface;

/**
 *
 * @author erikvanderschriek
 */
public class HomeTheater implements HomeTheaterInterface {
    private Tuner lnkTuner;
    private CDSpeler lnkCDSpeler;
    private Projector lnkProjector;
    private PopcornPopper lnkPopcornPopper;
    private Scherm lnkScherm;
    private Versterker versterker;
    private Lichten lnkLichten;

    @Override
    public void KijkFilmMetPopcorn() {
        versterker.inputChange("projector");

        Scherm.gaNaarBeneden();
       this.lnkPopcornPopper.on();
        lnkPopcornPopper.pop();
        lnkLichten.on();
        //...
    }

    @Override
    public void StopFilm() {
        // a lot of method calls
        ;
    }

    @Override
    public void LuisterNaarMuziek() {

        // a lot of method calls
        ;
    }

        @Override
    public void muteGeluid() {
            // a lot of method calls
            ;

        }
    
}
