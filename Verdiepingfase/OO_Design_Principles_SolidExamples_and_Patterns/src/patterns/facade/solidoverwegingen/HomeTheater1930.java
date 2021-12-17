/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.facade.solidoverwegingen;

import patterns.facade.solution.HomeTheaterInterface;

/**
 *
 * @author erikvanderschriek
 */
public class HomeTheater1930 implements HomeTheaterInterface {
    private ZwengelGrammofoon grammo;
    private LantaarnProjector projector;
    private Vrouw vrouw;
    private GasLantaarn licht;
    
    public void KijkFilmMetPopcorn() {
        
/*
        // stuur huisvrouw naar keuken om popcorn te maken
        vrouw.maakPopcornInKeuken();
        // laad film
        projector.laadFilm();
        // zet lamp aan
        projector.zetLampAan();
        // dim lichten
        licht.dim();
*/
        //etc.
        
    }

    @Override
    public void StopFilm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void LuisterNaarMuziek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void muteGeluid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
