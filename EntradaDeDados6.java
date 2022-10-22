
package entradadedados6;

/**
 *
 * O programa que receba dois números e ao final mostra 
 * a soma, subtração, multiplicação e divisão dos números lidos.
 */

import java.util.Scanner;

public class EntradaDeDados6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Insira o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Insira o segundo número: ");
        num2 = entrada.nextInt();
        
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        
    }
    
}