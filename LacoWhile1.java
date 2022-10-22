
package lacowhile1;

/**
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
* Repare que existe a variável contador, que é iniciada valendo 1 e, 
* a cada loop executado (repetição), é somado 1 ao contador. 
* Perceba que o while manterá a repetição enquanto a 
* variável contador for menor ou igual ao número 10.
* 
* Outro ponto importante é que a variável contador é 
* inicializada antes de chegar ao while, 
* porque o while comparará a sentença e só depois permitirá 
* a execução do bloco.
* 
* O programa que realizará uma contagem de 1 a 10, 
* conforme critério do laço while.
* 
*/

public class LacoWhile1 {

    public static void main(String[] args) {
        
        int contador =1;
        
        while(contador <= 10){
            System.out.println("Este é o número: "+ contador);
            contador++;
        }
    }
}
