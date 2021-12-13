/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */

package intelliware;

/**
 *
 * @author martijnthorig
 */
public class Stereo {
    
    public void On() {
       System.out.println("Stereo is on.");
    }
    
    public void Off() {
       System.out.println("Stereo is off.");
    }
    
    public void SetVolume(double pVolume) {
       System.out.println("Volume of stereo is set to " + pVolume);
    }
    
    public void SetBass(double pBass) {
       System.out.println("Bass of stereo is set to " + pBass);
    }
    
    public void SetTreble(double pTreble) {
       System.out.println("Treble of stereo is set to " + pTreble);
    }
    
    public void Turn2CD() {
       System.out.println("Stereo switches to CD.");
    }
    
    public void Turn2Radio() {
       System.out.println("Stereo switches to radio.");
    }
}
