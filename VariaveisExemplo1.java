
package variaveisexemplo1;

/**
 *
 * Calcula o número de meses que uma epssoa de 30 anos viveu
 * 
 * Nesse código muito simples, você está usando variáveis de 
 * número inteiro para armazenar a idade e a quantidade de meses. 
 * 
 * Note que a concatenação de string (com +) permite o uso de 
 * variáveis de qualquer tipo primitivo.
 */

public class VariaveisExemplo1 {

    public static void main(String[] args) {
        int idade = 30, meses;
        meses = idade * 12;
        
        System.out.println("A pessoa viveu " + meses + " meses");
        
    }
    
}
