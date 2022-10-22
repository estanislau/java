
package desviocondcomposto3;

/**
 *
 * Receber duas notas e calcular a média. 
 * Se ela for superior a 7, mostrar “Aprovado”; 
 * se estiver entre 5 e 7, mostrar “Recuperação”, 
 * e se estiver abaixo de 5, mostrar “Reprovado”.
 * 
 * Evidentemente, pode haver mais de um if dentro de outro. 
 * Também, naturalmente, o if aninhado pode estar 
 * dentro da porção if ou else do outro condicional.
 * 
 */

import java.util.Scanner;

public class DesvioCondComposto3 {

        public static void main(String[] args) {
        
        float nota1;
        float nota2;
        float media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        
        System.out.print("Primeira nota: ");
        nota1 = entrada.nextFloat();
        
        System.out.print("Segunda nota: ");
        nota2 = entrada.nextFloat();
        
        System.out.println();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 7.0){
            System.out.println("Aprovado");
        }else{
            if(media >= 5.0 && media < 7.0){
                System.out.println("Recuperação");
            }else{
                System.out.println("Reprovado");
            }
            System.out.println();
        }
    }
}