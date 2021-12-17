/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */

package virtualremote;


import java.util.ArrayList;
import java.util.List;

/**
 * @author martijnthorig
 */
public class VirtualRemote {
    private static final int NUMBER_OF_BUTTONS = 10;

    private List<Object> knoppen;

    public VirtualRemote() {
        knoppen = new ArrayList<>(NUMBER_OF_BUTTONS);
    }

    public void addActionToButton(int idx, Object object) {
        if (idx < this.knoppen.size() && idx >= 0)
            this.knoppen.set(idx, object);
    }
}
