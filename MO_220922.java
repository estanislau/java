/* 
* 
* Autor: Estanislau Gonçalves
* Twitter: estanislau@vivaldi.net
*
* Atualizado: 20/10/22  às 15:22 
* 
* Programa: 
* Objetivo: Exercício do: 22/09 - UC06 - Estrutura de decisão 
* e repetição + vetores e matrizes no Java + Dicas atividade 1
* 
*/

package mo_220922;

import java.util.Scanner;

public class MO_220922 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Variáveis
        int idade;
        String nome;
        double temperatura;
        
        System.out.print("Informe o nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Informe a idade: ");
        idade = entrada.nextInt();
        
        System.out.print("Informe a temperatura: ");
        temperatura = entrada.nextDouble();
        
        if(idade > 16 && idade <= 17){
            System.out.println("Voto opcional");
        }else if(idade >= 18){
            System.out.println("Voto obrigatório");
        }else{
            System.out.println("Voto não é obrigatório");
        }
        
    }
    
    
}
