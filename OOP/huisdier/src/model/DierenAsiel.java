package model;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class DierenAsiel {
    private List<Huisdier> dierenVerzameling;
    private String naam;


    public DierenAsiel(String naam) {
        this.naam = naam;
        this.dierenVerzameling = new ArrayList<>();
    }

    public void voegHuisDierToe(Huisdier dier){
        // stop huisdier in mijn verzameling dieren.
        //
        this.dierenVerzameling.add(dier);
    }

    public void toonAlleHuisDieren(){
        // loop door alle huisdieren en toon op system.out
        for(int i=0;i<this.dierenVerzameling.size();i++){
            // roep tostring aan van bepaald dier
            Huisdier opgevraagdeDier = this.dierenVerzameling.get(i);
            // opvragen wat het type is van het opgevraagdeDier
            if(opgevraagdeDier instanceof Cat ){
                System.out.println("het is een kat");
            } else if (opgevraagdeDier instanceof Hond){
                System.out.println("het is een hond");
            }
            else if (opgevraagdeDier instanceof Cavia){
                System.out.println("het is een cavia");
            }


            // tostring gebruiken om opgevraagde dier weer te geven
            System.out.println(opgevraagdeDier.toString());
        }
    }

    public void laatAlleDierenGeluidMaken(){
        // loop door alle huisdieren, met foreach loop
        for (Huisdier opgevraagdeDier: this.dierenVerzameling
             ) {
            //
            opgevraagdeDier.maakGeluid();
        };

    }

}
