
package lacofor1;

/**
 *
 * A instrução for (ou “para”) é um tipo de contador finito, 
 * isto é, ela realiza a contagem de um valor inicial 
 * conhecido até um valor final também conhecido.
 * 
 * O programa que realizará uma contagem, 
 * na ordem crescente, de 1 a 10.
 * 
 * 
 */
public class LacoFor1 {

    public static void main(String[] args) {
        int contador;
        
        // Inicialização: atribua o número 1 à variável contador;
        // Condição: atribua a condição menor ou igual a 10;
        // Incremento ou Decremento: use o incremento, pois quer-se
        // fazer uma contagem na ordem crescente.
        for(contador = 1; contador <= 10; contador++){
            System.out.println(contador);
        }
    }
    
}
