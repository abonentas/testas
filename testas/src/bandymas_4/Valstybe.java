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
class Valstybe implements Institucija{
    private String vardas;
    private Seimas seimas;

    public Valstybe(String vardas, Seimas seimas) {
        this.vardas = vardas;
        this.seimas = seimas;
    }

    @Override
    public void valdo() {
        System.out.println("seimas valdo valstybe");
    }
}

