
package desviocondcomposto2;

/**
 *
 * O programa que realiza uma autenticação de um usuário, 
 * permitindo acesso caso a senha seja o mês de aniversário ou a idade dele.
 */

import java.util.Scanner;

public class DesvioCondComposto2 {

    public static void main(String[] args) {
       int idade, senha, mes;
       String nome;
       
       Scanner entrada = new Scanner(System.in);
       System.out.println();
       
       System.out.println("--- Solicitando dados ao usuário --");
       
       System.out.print("Nome: ");
       nome = entrada.nextLine();
       
       System.out.print("Idade: ");
       idade = entrada.nextInt();
       
       System.out.print("Mês: ");
       mes = entrada.nextInt();
       
       System.out.println();
       System.out.println("--- Acesso ao sistema ---");
       System.out.print("Digite a senha: ");
       senha = entrada.nextInt();
       
       if(senha == mes || senha == idade ){
           System.out.println("Olá, " + nome + ", acesso permitido.");
       }else{
           System.out.println("Acesso negado.");
       }
       
       System.out.println("Fim do programa.");
       
       
    }
    
}
