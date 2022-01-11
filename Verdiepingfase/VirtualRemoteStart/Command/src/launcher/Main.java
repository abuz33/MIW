package launcher;

import intelliware.*;
import virtualremote.VirtualRemote;

public class Main {
    public static void main(String[] args) {
        VirtualRemote remote = new VirtualRemote();

        setupRemote(remote);

        System.out.println(remote);
    }

    private static void setupRemote(VirtualRemote remote) {
        remote.addActionToButton(0, new Stereo());
        remote.addActionToButton(1, new CeilingLight());
    }
}
