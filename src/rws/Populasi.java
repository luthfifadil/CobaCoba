/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rws;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;

/**
 *
 * @author luthfifadil
 */
public class Populasi {
    
    double random = Math.random()*50+1;
    Individu[] pop;
    
    public Populasi(int jumlah){
        pop = new Individu[jumlah];
        for (int i = 0; i < jumlah; i++){
            pop[i] = new Individu();
            pop[i].setFitness(random);          
        }
    }
    
}
