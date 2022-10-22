
package ifelse;

/**
 * https://is.gd/B7nQKz
 * 
 * O programa informa se o usuário pode ou não tirar CNH.
 * Maior ou igual a 18 = Apto para tirar a CNH.
 * Igual a 17 = Ainda falta um ano para tirar a CNH, tenha calma"
 * Menou ou igual a 16 = Você ainda não está apto para tirar a CNH.
 */

// Biblioteca "Scanner", necessária para a entrada de dados:
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        // Depende da biblioteca "Scanner":
        Scanner entrada = new Scanner(System.in); 
        // Variáveis:
        String nome;
        int idade;
        
        System.out.print("Digite o seu nome: ");
        // Quando se trabalha com String usamos ".nextLine":
        nome = entrada.nextLine(); 
        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();
        
        //System.out.println(nome + " " + idade);
        
        if (idade >= 18) {
            System.out.println(nome +", você está apto para tirar a CNH.");
            
        } else if (idade == 17){
            System.out.println(nome +", ainda falta um ano para você tirar"
                    + " a sua CNH, tenha calma.");
        } else {
            System.out.println(nome + ", você ainda não tem idade para"
                    + " tirar a sua CNH.");
        }
        
        
    }
    
}
