
package desviocondsimples;

/**
 *
 * Um desvio condicional será simples quando se tiver 
 * uma condição que desvia a execução do programa, 
 * caso o resultado lógico avaliado de certa condição seja verdadeiro. 
 * Se o resultado lógico avaliado for falso, nada acontecerá, 
 * e o programa simplesmente seguirá o seu fluxo de execução 
 * (as instruções após o condicional).
 * 
 * Elabore um programa que leia dois valores numéricos inteiros, 
 * some esses valores e apresente o resultado, caso o 
 * valor somado seja maior que 10.
 */

import java.util.Scanner;

public class DesvioCondSimples {

   
    public static void main(String[] args) {
        
        int a, b, resultado;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre o valor <A>: ");
        a = input.nextInt();
        System.out.print("Entre o valor <B>: ");
        b = input.nextInt();
        
        resultado = a + b;
        
        if(resultado > 10){
            System.out.println("Resultado = " + resultado);
        }
        System.out.println("Fim do programa");
                
    }
    
}
