
package lacowhile2;

/**
* 
* O while é outro laço condicional, isto é, 
* um conjunto de instruções que são repetidas 
* enquanto o resultado de uma 
* expressão lógica (uma condição) é avaliado como verdadeiro.
* 
* A instrução while avalia o resultado da expressão (condição) 
* antes de executar as instruções do bloco { }. 
* Assim, é possível que as instruções nunca sejam executadas, 
* caso a condição seja inicialmente falsa. 
* Um problema típico, relacionado à avaliação 
* da condição while, é o laço infinito: caso a condição 
* nunca se torne falsa, o laço será repetido infinitamente.
* 
* Note que o resultado desse programa será o mesmo do exemplo 1, 
* mas, utilizando o do-while, primeiro são colocadas 
* as instruções (do) e depois a condição (while).
* 
* O programa que realizará uma contagem de 1 até 10, 
* conforme critério do laço do-while.
* 
*/

public class LacoWhile2 {

    public static void main(String[] args) {

        int i = 1;
        
        do{
            System.out.println("Número: " + i);
            i++;
        }while(i <= 10);
    }
    
}
