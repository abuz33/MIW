/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.facade.solution;

/**
 * @author erikvanderschriek
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // stop met luisteren naar muziek, en kijk een film met popcorn erbij
       HomeTheaterInterface ht = new HomeTheater();

        // TODO
        ht.KijkFilmMetPopcorn();



    }

}
