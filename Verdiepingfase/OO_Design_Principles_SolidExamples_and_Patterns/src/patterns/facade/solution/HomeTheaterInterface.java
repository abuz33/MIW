/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.facade.solution;

/**
 *
 * @author erikvanderschriek
 */
public interface HomeTheaterInterface {
    /**
     * deze methode start een film
     */
    public void KijkFilmMetPopcorn();
    
    /**
     * deze methode stopt een film
     */
    public void StopFilm();
    
    /**
     * deze methode start muziek
     */
    public void LuisterNaarMuziek();
    
    /**
     * deze methode zet het geluidsniveau naar 0.
     */
    public void muteGeluid();
}
