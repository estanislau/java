
package lacowhile4;

/**
 *
 * O programa Java que valida a entrada do usuário. 
 * Ele deve informar uma idade válida, que deve estar entre 0 e 150.
 * 
 * Validações de entrada de usuário são bastante importantes 
 * para que não seja gerado erro no programa. No caso apresentado, 
 * seria possível, evidentemente, utilizar o laço while ao invés de do-while; 
 * no entanto, como sempre há ao menos uma entrada de dados do usuário, 
 * o do-while torna-se um pouco mais lógico.
 * 
 */

import java.util.Scanner;

public class LacoWhile4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        
        do{
            System.out.println("Informe uma idade válida (entre 0 e 150): ");
            idade = entrada.nextInt();
        }while(idade < 0 || idade > 150);
        
        System.out.println("\nObrigado por informar uma idade válida\n");
    }
    
}
