/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rws;

/**
 *
 * @author luthfifadil
 */
public class Populasi {

    public static final int jumlah = 500;
    private Individu[] pop;
    
    public Populasi(){
        pop = new Individu[jumlah];
        for (int i = 0; i < jumlah; i++){
            pop[i] = new Individu();
        }
    }
    
    
}
