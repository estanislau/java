
package entradadedados2;

/**
 * Uso da classe Scanner para entrada de dados.
 * Dada uma idade, calcule o número de meses que a pessoa viveu.
 * 
*/

import java.util.Scanner;

public class EntradaDeDados2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, meses;
        
        System.out.print("Digite a idade: ");
        // Lê um número inteiro no console:
        idade = entrada.nextInt();
        
        meses = idade * 12;
        
        System.out.println("A pessoa viveu " + meses + " meses.");
        
    }
    
}
