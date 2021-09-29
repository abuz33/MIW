package model;

import java.util.ArrayList;
import java.util.Collections;

public class Vestiging {
    private String plaats;
    private String manager;
    private ArrayList<Auto> autos;

    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
        this.autos = new ArrayList<>();
    }

    public void voegAutoToe(Auto auto) {
        this.autos.add(auto);
    }

    @Override
    public String toString() {
        Collections.sort(autos);
//        ArrayList<Auto> autos2 = new ArrayList<>();
//        int n = autos.size();
//        Auto[] as = new Auto[n];
//        for (int i = 0; i < n; i++) {
//            as[i] = autos.get(i);
//        }
//        Auto temp;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - i); j++) {
//                if (as[j - 1].getJaar() > as[j].getJaar()) {
//                    temp = as[j - 1];
//                    as[j - 1]= as[j];
//                    as[j] = temp;
//                }
//
//            }
//        }

        StringBuilder resultString = new StringBuilder(String.format("Plaats:%s\nManager:%s", plaats, manager));
        for (Auto a : autos) {
            resultString.append(a);
            resultString.append("\n");
        }

        return resultString.toString();
    }
}
