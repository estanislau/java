/*
* 
* TDS - Mód II - Desenvolver Código Orientado a Objetos (660008016A)
*
* Escreva um programa Java que faça a troca de quartos entre dois hospedes. 
* Receba o nome de um cliente e sua idade; ele a princípio será 
* hospedado no quarto A. Depois receba o nome de outro cliente e sua idade; 
* se ele for mais jovem, ficará no quarto B, mas se for velho que o 
* primeiro cliente, ele ficará no quarto A e o primeiro cliente 
* ficará no quarto B. Além disso, se a pessoa mais velha 
* for idosa (tem 60 anos ou mais) terá desconto de 40%. 
* Mostre ao final o nome do cliente que ficou no quarto A 
* e o desconto, se possuir, e qual ficou no quarto B.
* 
* Autor: Estanislau Gonçalves
* Contato: estanislau@vivaldi.net
*
* Atualizado: 22/10/22  às 12:28
* 
*/

package m02dcooa01e02;

import java.util.Scanner;

public class M02DCOOA01E02 {

    public static void main(String[] args) {
        
        // Declaração de variáveis:
        int idade1, idade2;
        String nome1, nome2;
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nome 1: ");
        nome1 = entrada.nextLine();
        
        System.out.print("Idade 1: ");
        idade1 = entrada.nextInt();
        
        System.out.print("Nome 2: ");
        nome2 = entrada.nextLine();
        
        System.out.print("Idade 2: ");
        idade2 = entrada.nextInt();
        
        if( idade1 > idade2){
            System.out.println("Quarto A: " + nome1);
        }else{
            if(idade2 )
        }
        
        
       //System.out.println("Quarto A: " + nome + ", " + idade + " anos");
        
        
    }
    
}
