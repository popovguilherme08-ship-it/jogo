
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ex01;
import java.util.Scanner;



public class wx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto;
        int palpite;
        int dificuldade;
        int tentativas = 0;
        int tentativasUsadas = 0;
        boolean acertou  = false;

        System.out.println("=================================================");
        System.out.println("             JOGO DE ADIVINHACAO");
        System.out.println("=================================================");
        System.out.println("O computador sorteou um numero entre 1 e 100.");
        System.out.println("Sua missao eh descobrir qual eh!");
        System.out.println("=================================================");

        System.out.println("\nESCOLHA A DIFICULDADE:");
        System.out.println("1 - Facil   (10 tentativas)");
        System.out.println("2 - Medio   (7 tentativas)");
        System.out.println("3 - Dificil (5 tentativas)");
        System.out.print("\nDigite sua opcao: ");

        dificuldade = sc.nextInt();

        if (dificuldade == 1) {
            tentativas = 10;
        } else if (dificuldade == 2) {
            tentativas = 7;
        } else if (dificuldade == 3) {
            tentativas = 5;
        } else {
            System.out.println("\nOpcao invalida!");
            System.out.println("Modo facil selecionado automaticamente.");
            tentativas = 10;
        }

                

        numeroSecreto = (int) (Math.random() * 100) + 1;

         while (tentativas > 0) {

            System.out.println("\nTentativas restantes: " + tentativas);

            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            tentativasUsadas++;

            if (palpite == numeroSecreto) {

                acertou = true;
                break;

            } else if (palpite > numeroSecreto) {

                System.out.println("O numero secreto eh MENOR!");

            } else {

                System.out.println("O numero secreto eh MAIOR!");

            }

            tentativas--;
         }

        if (!acertou) {
           System.out.println("                 PARABENS!");
        }
        sc.close();
        
        }
}
