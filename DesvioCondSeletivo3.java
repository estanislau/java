
package desviocondseletivo3;

/**
 *
 * Crie um programa Java que recebe o 
 * nome de uma forma geométrica (retângulo, triangulo ou círculo) e, 
 * de acordo com a forma, solicita dados para cálculo 
 * da área e realiza esse cálculo.
 * 
 */

import java.util.Scanner;

public class DesvioCondSeletivo3 {

    public static void main(String[] args) {

Scanner entrada = new Scanner(System.in, "latin1");//permite acentos

        String forma;
        float raio;
        float base;
        float altura;
        float area;

        System.out.print("--- Escolha a forma geométrica"
                + " para realizar o cálculo de sua área ---\n");
        System.out.print("1 - Retângulo\n");
        System.out.print("2 - Triângulo\n");
        System.out.print("3 - Círculo\n");
        
        System.out.println();
        
        System.out.print("Digite o número correspondente a opção desejada: ");
        forma = entrada.nextLine();
        
        switch(forma){
            case "1":
            case "retângulo":
            case "retangulo":
                System.out.print("Digite a base: ");
                base = entrada.nextFloat();
                System.out.print("Digite a altura: ");
                altura = entrada.nextFloat();
                
                area = base * altura;
            
                System.out.println("Área do retângulo: " + area);
                break;
            case "2":
            case "triângulo":
            case "triangulo":
                System.out.print("Digite a base: ");
                base = entrada.nextFloat();
                System.out.print("Digite a altura: ");
                altura = entrada.nextFloat();
                
                area = base * altura / 2;
                
                System.out.println("Área do triângulo: " + area);
                break;
            case "3":
            case "círculo":
            case "circulo":
                System.out.print("Digite o raio: ");
                raio = entrada.nextFloat();
                
                area = 3.1416f * raio * raio;
                
                System.out.println("Área do círculo: " + area );
                break;
                
            default:
                System.out.println("Forma não reconhecida.");
                break;
        }
        
    }
    
}