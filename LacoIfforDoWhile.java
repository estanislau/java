
package lacoiffordowhile;

/**
 *
 * Criar um programa que irá realizar a contagem
 * até o número digitado pelo usuário.
 * Porém, iremos limitar qual será o número máximo.
 * 
 */

import java.util.Scanner;

public class LacoIfforDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int contagem;
        
        do{
            
        System.out.print("Qual o número máximo para realizar a contagem?: ");
        contagem = entrada.nextInt();
        
        System.out.print("Digite até quando irá a sua contagem: ");
        numero = entrada.nextInt();
        
        if (numero <= contagem) {
            
            for (int i = 0; i < numero; i++) {
                System.out.println("Número: " + i);
                
            }
            
        } else {
            System.out.println("Contagem muito alta: escolha outra contagem.");
        }
    }while(numero > contagem);
        
    }
    
}
