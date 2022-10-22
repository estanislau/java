
package lacofor2;

/**
 *
 * A instrução for (ou “para”) é um tipo de contador finito, 
 * isto é, ela realiza a contagem de um valor inicial 
 * conhecido até um valor final também conhecido.
 * 
 * O programa recebe um número e mostra na tela 
 * a tabuada desse número.
 * 
 * Observe, pelo exemplo anterior, que, em Java, 
 * é possível declarar e inicializar a variável 
 * de contagem diretamente na instrução 
 * for (no caso, int i = 1). 
 * Essa variável existe apenas no escopo do laço for; 
 * fora do laço, ela não será reconhecida.
 * 
 */

import java.util.Scanner;

public class LacoFor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int resultado;
        
        System.out.print("Informe o número: ");
        numero = entrada.nextInt();
        
        for(int i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    
}
