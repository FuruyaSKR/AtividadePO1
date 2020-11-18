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
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sal = 0, valora, sala;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        sal = scan.nextFloat();
        if (sal <= 280){
            valora = (float) (sal*0.2);
            sala = sal+valora;
            System.out.println("salario antes do reajuste:"+sal);
            System.out.println("foi aplicado 20% de reajuste");
            System.out.println("o valor do aumento foi de "+valora);
            System.out.println("salario final e de: "+sala);
        }else if (700 >= sal && sal > 280){
            valora = (float) (sal*0.15);
            sala = sal+valora;
            System.out.println("salario antes do reajuste:"+sal);
            System.out.println("foi aplicado 15% de reajuste");
            System.out.println("o valor do aumento foi de "+valora);
            System.out.println("salario final e de: "+sala);
        }else if (1500 >= sal && sal > 700){
            valora = (float) (sal*0.1);
            sala = sal+valora;
            System.out.println("salario antes do reajuste:"+sal);
            System.out.println("foi aplicado 10% de reajuste");
            System.out.println("o valor do aumento foi de "+valora);
            System.out.println("salario final e de: "+sala);
        }else if (1500 < sal){
            valora = (float) (sal*0.05);
            sala = sal+valora;
            System.out.println("salario antes do reajuste:"+sal);
            System.out.println("foi aplicado 5% de reajuste");
            System.out.println("o valor do aumento foi de "+valora);
            System.out.println("salario final e de: "+sala);    
        }    
    
    
    
    }
    
}
