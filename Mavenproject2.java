
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int numeroSecreto;
        int palpite;
        int dificuldade;
        int tentativas = 0;
        int tentativasUsadas = 0;
        
        boolean acertou = false;
        
        System.out.println("\n=============================================");
        System.out.println("Bem-Vindo");
        System.out.println("================================================");
        System.out.println("O computafor sorteou ume numero de 1 a 100");
        System.out.println("Tente acertar o número");
        
        
        System.out.println("\nECOLHA A DIFICULDADE");
        System.out.println("1---Facil  (10 tentativas)");
        System.out.println("2---médio  (7 tentativas)");
        System.out.println("3---difícil  (5 tentativas)");
        
        dificuldade = sc.nextInt();
        
        if(dificuldade == 1){
            tentativas = 10;
        }else if (dificuldade == 2){
            tentativas = 7;
        }else if (dificuldade == 3){
            tentativas = 5;
        }else{
            System.out.println("opçção invalida");
        }
         numeroSecreto = (int)(Math.random() * 100) + 1;
         
         while(tentativas>0){
             System.out.println("\tentativas restantes"+tentativas);
             
             System.out.println("Digite um numero de 1 a 100");
             palpite = sc.nextInt();
             
             tentativasUsadas++;
             
             if(palpite>numeroSecreto){
                 System.out.println("Numero secreto é menor");
             }else if (numeroSecreto>palpite){
                 System.out.println("Número secreto é maior");
             }else if(palpite==numeroSecreto){
                 acertou=true;
                 break;
             }
             tentativas--;
         }
       if (acertou){
           System.out.println("PARABÉNS");
           System.out.println("VOCÊ VENCEU");
           System.out.println("Numero Secreto"+numeroSecreto);
           System.out.println("Tentativas usadas"+tentativasUsadas);
           
       }else{
           System.out.println("PERDEU");
           System.out.println("TENTE NOVAMENTE");
           System.out.println("Numero Secreto"+numeroSecreto);
           System.out.println("Tentativas usadas"+tentativasUsadas);
       }
                
    }
}
