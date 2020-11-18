/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.exercicios;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author NulldextroyerJr
 */
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        // TODO code application logic here
        int peso;
        float pesoi, alt;
        String sex;
        System.out.println("digite seu peso:");
        peso = scan.nextInt();
        
        System.out.println("digite sua altura:");
        alt = scan.nextFloat();
        
        System.out.println("digite seu sexo:");
        sex = scan.next();
        
        if("m".equals(sex)){
            pesoi = (float) ((72.7*alt)-58);
        }else{
            pesoi = (float) ((62.1*alt)-44.7);
        } 
            
        if (peso > pesoi){
            System.out.println("voce esta acima do peso ideal, seu peso ideal é "+pesoi);
        }else if(peso < pesoi){
            System.out.println("vc esta abaixo do peso ideal, seu peso ideal é"+pesoi);
        }else{
            System.out.println("vc esta no peso ideal");
        }
        
    }
    
}
