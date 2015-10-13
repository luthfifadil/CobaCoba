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

public class RWS {
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Populasi pop1 = new Populasi(100);
        double sum = 0;
        for (int i = 0 ; i < 100 ; i ++) {
            sum += pop1.pop[i].getFitness();
        }
        double random = Math.random() * sum + 0;
        
        
        
// TODO code application logic here
    }
    
}
