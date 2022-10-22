
package entradadedados4;

/**
 *
 * Dado o raio de um círculo, calcule sua área (A=πr²).
 * 
 */

import java.util.Scanner;

public class EntradaDeDados4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float pi = 3.1416f;
        float raio;
        
        raio = entrada.nextFloat();
        
        float area = pi * raio * raio;
        
        System.out.println("A área do círculo é " + raio + "cm");
        
    }
    
}
