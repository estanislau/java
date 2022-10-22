
package entradadedados;

/**
 *
 * @author adama
 */

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;
        
        /*
         * Declaração do scanner:
         * A palavra "entrada" será o objeto criado, 
         * fique à vontade para trocá-la por outra.
         * 
         * Não se esqueça de importar o pacote java.util.Scanner, 
         * clicando no símbolo de erro na linha
         * 
        */
        
        Scanner entrada = new Scanner (System.in);
        
        /*
        Solicitando os dados para o usuário e 
        armazenando nas variáveis criadas.
        */
        System.out.println("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite a sua altura: (Forneça a mesma usando o aparador ,)");
        altura = entrada.nextFloat();
        entrada.close(); // Fechando o buffer de entrada.
        
        // Mostrando os dados na tela:
        System.out.println("\n---MOSTRANDO OS DADOS ---");
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua altura: " + altura);
        
        
        
    }
    
}
