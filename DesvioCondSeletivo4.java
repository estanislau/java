
package desviocondseletivo4;

/**
 *
 * Escreva um programa que mostrará duas opções para o usuário e, 
 * em seguida, solicitará ao usuário que escolha uma opção.
 * 
 * Java
 * JDK
 * 
 * Caso o usuário escolha 1, será mostrada a mensagem: 
 * “Java é uma linguagem de programação e plataforma computacional”. 
 * Se o usuário escolher 2, será mostrada a mensagem: 
 * “É um pacote de software que você pode usar para 
 * desenvolver aplicativos baseados em Java”. 
 * Qualquer outra opção mostrará a mensagem: 
 * “Opção inválida”.
 * 
 */

import java.util.Scanner;

public class DesvioCondSeletivo4 {

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");
                String opcao;
    
    System.out.print("Escolha uma opção:\n");
    System.out.print("1 - Java\n2 - JDK\nOpção: ");
        opcao = entrada.nextLine();
        
    System.out.println();
    
    switch(opcao){
        case "1":
        case "java":
        case "Java":
            System.out.println("Java é uma linguagem de programação e "
                    + "plataforma computacional.");
    System.out.println();
        break;
    
        case "2":
        case "jdk":
        case "JDK":
            System.out.println("É um pacote de software que você pode usar para"
                    + "\ndesenvolver aplicativos baseados em Java");
        System.out.println();
        break;
        
        default:
            System.out.println("Opção inválida.");
            
        System.out.println();
    }
                        
                        
                        
    }
    
}
