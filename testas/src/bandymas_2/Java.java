/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandymas_2;


import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author kiestaz
 */
public class Java {
    public static void main(String args[]){
        List<Garsas> zebru_sarasas = new ArrayList<>();
        zebru_sarasas.add(new Zebras());
        zebru_sarasas.add(new Motociklas());
        //zebru_sarasas.add((Garsas) new Object());
        zebru_sarasas.forEach((_item) -> {
            System.out.println(zebru_sarasas);
        });
}
        }
        
    

    
