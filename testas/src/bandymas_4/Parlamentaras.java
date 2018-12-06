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
class Parlamentaras {
    private final String name;
    private final String pavarde;

    public Parlamentaras(String name, String pavarde) {
        this.name = name;
        this.pavarde = pavarde;
    }
    public String gautiVardairPavarde(){
        return name +" "+pavarde;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parlamentaras{" +
                "name='" + name + '\'' +
                ", pavarde='" + pavarde + '\'' +
                '}';
    }
}
