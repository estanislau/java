
package araynumeros;

/**
 *
 * Crie um vetor de 10 números inteiros, inicializando-o com valores aleatórios.
 * 
 * Os números mudarão, pois random gera números aleatórios
 * 
 * int [] numeros = new int [10]: declara o array unidimensional 
 * chamado números, contendo dez elementos (índices de 0 a 9).
 * 
 * for (int i = 0; i < 10; i++): contém um laço de repetição com a 
 * instrução for, que faz com que as linhas 6 a 8 sejam executadas dez vezes. 
 * O valor da variável "i" inicia em zero é incrementado em 1 até o 
 * limite estabelecido pelo laço.
 * 
 * numeros[i] = (int) (Math.random() * 100): armazena no array numeros 
 * um valor gerado aleatoriamente por meio do método random. 
 * A cada ciclo de execução do laço, o número gerado é armazenado 
 * em um elemento diferente do array. Na primeira vez, o número 
 * é armazenado em numeros[0], na segunda, em numeros[1], e assim sucessivamente.
 * 
 * System.out.println("Número: " + numeros[i]): imprime em tela o número gerado 
 * que foi armazenado no elemento do array.
 * 
 */

public class ArayNumeros {
   
    public static void main(String[] args) {
        int [] numeros = new int [10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100);
            System.out.println("Número: " + numeros[i]);
        }
    }
}
