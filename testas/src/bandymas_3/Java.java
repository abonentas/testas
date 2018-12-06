/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandymas_3;

/**
 *
 * @author kiestaz
 */
public class Java {
    public static void main(String args[]){
        System.out.println(koordinates(10,20));
        System.out.println(koordinates(8,32.0));
        System.out.println(koordinates(8.0,32.0));
        
    }
    static String koordinates(int x, int y){return "x:"+x +", y:" + y;}
    static String koordinates(double x, double y){return "x:"+x +", y:" + y;}
    static String koordinates(int x, double y){return "x:"+x +", y:" + y;}
}
