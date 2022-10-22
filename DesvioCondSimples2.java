
package desviocondsimples2;

/**
 *
 * Um desvio condicional será simples quando se tiver 
 * uma condição que desvia a execução do programa, 
 * caso o resultado lógico avaliado de certa condição seja verdadeiro. 
 * Se o resultado lógico avaliado for falso, nada acontecerá, 
 * e o programa simplesmente seguirá o seu fluxo de execução 
 * (as instruções após o condicional).
 * 
 * Programa para verificar se uma pessoa é maior de idade, 
 * usando somente o if, então não haverá resultado caso 
 * o usuário seja menor de idade.
 */

import java.util.Scanner;

public class DesvioCondSimples2 {


    public static void main(String[] args) {
        String nome;
        int idade;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();
        
        if(idade >= 18){
            System.out.println(nome + ", sua idade é " + idade + " anos e você é maior de idade.");
        }
        }
        
    }
