
package desviocondseletivo;

/**
 *
 * Trabalhar com grande quantidade de desvios condicionais 
 * pode resultar em um programa de difícil interpretação. 
 * Para auxiliar e facilitar esse tipo de necessidade, 
 * existe a estrutura de controle com múltipla escolha, 
 * denominada switch
 * 
 * <variável> é o nome da variável a ser controlada na decisão. 
 * <opção> é conteúdo da variável a ser verificado. 
 * <operação> é a execução de alguma ação específica.
 * 
 * A instrução default da estrutura de seleção switch 
 * e qualquer operação a ela associada são opcionais, 
 * não caracterizando obrigatoriedade de uso. 
 * A instrução break tem a finalidade de desviar o processamento 
 * para fora do comando switch. Isso é necessário porque, 
 * após o processamento de cada case, 
 * ocorre retorno do fluxo de ação do comando para a 
 * primeira instrução após sua chamada, 
 * que nesse caso será break.
 * 
 * A variável utilizada em uma estrutura switch 
 * para controlar a ação desse tipo de desvio pode ser 
 * do tipo inteiro, char ou string.
 * 
 * Crie um programa que solicite a entrada de 
 * um valor numérico inteiro entre 1 e 7 e 
 * apresente o nome do dia da semana por extenso.
 * 
 * É muito importante considerar que, 
 * do ponto de vista operacional de funcionalidade de um computador, 
 * o uso da instrução switch prevê apenas condições 
 * com operador relacional do tipo “igual a”. 
 * Em situações operacionais que envolvam outras 
 * formas de relações lógicas, deve-se fazer 
 * uso da instrução if nas formas sequencial ou encadeada.
 * 
 */

import java.util.Scanner;

public class DesvioCondSeletivo {
    
    public static void main(String[] args) {
        int dia;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre um valor referente a um "
                + "dia da semana: ");
        dia = entrada.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
    
}