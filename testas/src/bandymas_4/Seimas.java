/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandymas_4;

/**
 *
 * @author kiestaz
 */
class Seimas extends Pastatas implements Institucija{

    String name;

    public String getName() {

        return name;
    }

    public Seimas(String adresas, Parlamentaras[] parlamentaras) {
        super(adresas);
        this.parlamentaras = parlamentaras;
    }

    @Override
    public void valdo() {
        System.out.println("seimas valdo");
    }

    Parlamentaras parlamentaras[];

public Seimas(Parlamentaras[] parlamentaras, String adresas) {
  super(adresas);
  this.parlamentaras = parlamentaras;
 }

    void prideti_seimo_nari() {
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }

    void perziureti_narius() {
       /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }

    Iterable<Parlamentaras> getParlamentaras() {
        return null;
       /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    
}}