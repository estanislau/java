
package lacowhile3;

/**
 *
 * O programa Java para ler os tempos de volta 
 * de um velocista e calcular qual foi o menor tempo.
 * 
 * While e do-while são ideais quando não se sabe 
 * quantas vezes o laço terá que executar, 
 * como no exemplo mostrado (o usuário pode informar “N” após 
 * a primeira entrada ou após ter informado centenas de valores). 
 * Quando se sabe exatamente quantas iterações o laço tem que executar, 
 * o mais indicado é usar for.
 * 
 */

import java.util.Scanner;

public class LacoWhile3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float tempoVolta;
        float menorTempo = 100000; // Tempo máximo por volta.
        String continuar = "S";
        
        // Inicializando o menor tempo com o maior valor possível
        // (qualquer primeiro valor informado será menor que este)
        menorTempo = Float.MAX_VALUE;
        
        while(continuar.equals("S"))
        {
            System.out.print("Informe o(s) tempo(s) da volta do velocista: ");
            tempoVolta = entrada.nextFloat();
            
            // Este nextLine é necessário para que o próximo
            // nextLIne, ao fim do laço, não falhe
            // consome o "Enter" digitado pelo usuário.
            entrada.nextLine();
            
            if(menorTempo > tempoVolta)
            {
                menorTempo = tempoVolta;
            }
            System.out.print("Deseja informar novo tempo? [S/N]: ");
            continuar = entrada.nextLine();
        }
        System.out.println();
        System.out.println("A menor volta do velocista foi de " + menorTempo + " segundos.");
        System.out.println();
    }
    
}
