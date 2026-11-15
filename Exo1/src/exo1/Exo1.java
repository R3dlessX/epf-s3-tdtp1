/*
 * TDTP Exercice 1
 * MRG
 * Septembre 2026
 */
package exo1;

import java.util.Scanner;

/**
 * 
 * @author bialekmaxandre
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Aurevoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println("Bonjour, " + prenom);
        
    }
    
}
