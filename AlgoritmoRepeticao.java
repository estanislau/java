/* 
* 
* Autor: Estanislau Gonçalves
* Contato: estanislau@vivaldi.net
*
* Atualizado: 20/10/22  às 15:28 
* 
* Programa: 
* Objetivo: 
* 
*/

package mo_220922;

import java.util.Scanner;

public class AlgoritmoRepeticao {
    
        public static void main(String[] args){
            
            Scanner entrada = new Scanner(System.in);
            
            int i;
            int maximo;
            int par = 0;
            int impar = 0;
            
            do{
                System.out.print("Número de repetições: ");
                maximo = entrada.nextInt();
            
                if(maximo <= 0){
                    System.out.println("Informe um número válido.");
                }
            
            }while(maximo <= 0);
            
            for(i = 0; i < maximo; i++){
                System.out.println("Registros: " + i);
                
           if(i % 2 == 0){
                par++;
            }else{
                impar++;
            }
            }
            
            System.out.println("Total de pares: " + par);
            System.out.println("Total de ímpares: " + impar);
        }
}
