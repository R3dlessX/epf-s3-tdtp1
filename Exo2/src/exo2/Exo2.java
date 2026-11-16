/*
 * TDTP Exercice 2
 * MRG
 * Septembre 2026
 */
package exo2;

/**
 *
 * @author bialekmaxandre
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;
        int result; 
        int ind;
        
        nb = 5;
        result = 0;
        
        ind = 1;
        while (ind <= nb) {
            result=result+ind;
        }
        
        System.out.println("la somme des "+nb+" entiers est : "+ result);
    }
    
}
