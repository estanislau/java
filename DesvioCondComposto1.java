
package desviocondcomposto1;

/**
 *
 * Elabore um programa que faça a leitura de dois valores numéricos 
 * do tipo inteiro e efetue a adição desses valores. 
 * Caso o resultado obtido seja maior que 10,
 * o programa apresentará a mensagem 
 * “Resultado ultrapassa o valor dez.”. 
 * Caso o resultado do valor somado não seja maior que 10, 
 * o programa deverá apresentar a mensagem 
 * “Resultado não ultrapassa o valor dez.”.
 * 
 */

import java.util.Scanner;

public class DesvioCondComposto1 {

    public static void main(String[] args) {
        int num1, num2, resultado;
                
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Segundo número: ");
        num2 = entrada.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println();
        
        if(resultado > 10){
            System.out.println("O resultado, " + resultado + ", ultrapassa o valor de dez.");
        }else{
            System.out.println("O resultado, " + resultado + ", não ultrapassa o valor de dez.");
        }
        System.out.println("Fim do programa.");
                
                
    }
    
}
