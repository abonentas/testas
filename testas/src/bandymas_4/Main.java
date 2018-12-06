/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandymas_4;

import java.util.Iterator;


/**
 *
 * @author kiestaz
 */
public class Main {
    public static void main(String[] args) {


        Parlamentaras petras = new Parlamentaras("Petras", "Petraitis");
        Parlamentaras ona = new Parlamentaras("Ona", "Petraitiene");
        Parlamentaras jonas = new Parlamentaras("Jonas", "Jonaitis");

        Parlamentaras parlamentarai[] = {petras, ona, jonas};

        System.out.println(petras);

        Seimas seimas = new Seimas("Jasinskio g. 15", parlamentarai);
        seimas.prideti_seimo_nari();
        seimas.perziureti_narius();
        Valstybe valstybe = new Valstybe("Lietuva", seimas);

        for (Parlamentaras elem : seimas.getParlamentaras()) {
            System.out.println(elem.getName());
        }
    }
}