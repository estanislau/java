
package operadorcondternario;

/**
 *
 * A linguagem Java, bem como outras linguagens, 
 * conta com um operador condicional que funciona 
 * como um if simples, em uma única linha. 
 * É o operador ternário
 * 
 * Confira no exemplo a seguir um trecho de código Java 
 * para preencher a variável “resultado” com o valor “par”, 
 * se um número inteiro for par, e “ímpar”, caso contrário.
 * 
 */

import java.util.Scanner;

public class OperadorCondTernario {

    public static void main(String[] args) {
        int valor;
        String resultado;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        valor = entrada.nextInt();
        
        // Operador ternário
        resultado = (valor % 2 == 0) ? "par" : "ímpar";
        
        System.out.println(resultado);
        System.out.println();
    }
    
}
