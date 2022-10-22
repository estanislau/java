/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiramatriz;

/**
 *
 * Preencher uma matriz de três linhas e quatro colunas com números aleatórios.
 * 
 * Nesse código, foi utilizado um laço controlado pela variável “i” 
 * para percorrer linha a linha e, dentro desse laço, um controle 
 * pela variável “j”, indo coluna a coluna. 
 * 
 */

import java.util.Random;

public class PrimeiraMatriz
{

    public static void main(String[] args) {
        int[][] numAleatorio = new int[3][4];
        
        Random numeroRandom = new Random();

        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                numAleatorio[i][j] = numeroRandom.nextInt(10);//gera número aleatório de 0 a 10
            }
        }

        System.out.print("\t\tMatriz\n");
        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                System.out.print("\t" + numAleatorio[i][j] + " ");
            }
            System.out.println();       
        }
    }

}