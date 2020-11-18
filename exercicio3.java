/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.exercicios;

import java.util.Scanner;

/**
 *
 * @author NulldextroyerJr
 */
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int cen = 0;
        int cinq = 0;
        int dez = 0;
        int cinc = 0;
        int und = 0;
        int resto;
        System.out.print("Digite o valor de saque entre 10 e 600: ");
        n = scan.nextInt();
        if (n >= 10 && n <= 600) {
            if (n > 99) {
                cen = n / 100;
                resto = n % 100;
            } else {
                resto = n;
            }
            if (resto > 49) {
                cinq = resto / 50;
                resto = resto % 50;
            }
            if (resto > 9) {
                dez = resto / 10;
                resto = resto % 10;
            }
            if (resto > 4) {
                cinc = resto / 5;
                resto = resto % 5;
            }
            if (resto > 0) {
                und = resto;
            }
        
            System.out.println("notas de 100: " + cen);
            System.out.println("notas de 50: " + cinq);
            System.out.println("notas de 10: " + dez);
            System.out.println("notas de 5: " + cinc);
            System.out.println("notas de 1: " + und);
        
        }else{
            System.out.println("numero invalido");
        }
    }

}
