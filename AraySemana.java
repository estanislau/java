
package araysemana;

/**
 * 
 * Inicializa um vetor de string com os dias da semana.
 * 
 * String[] semana = { "Domingo", "Segunda", "Terça", "Quarta", 
 * "Quinta", "Sexta", "Sabádo" }: declara o array unidimensional chamado semana,
 * contendo os sete dias da semana por extenso (índices de 0 a 6).
 * 
 * for (int i = 0; i < semana.length; i++): contém um laço de repetição 
 * com a instrução for, que faz com que a linha 6 seja executada sete vezes, 
 * imprimindo o conteúdo dos elementos do array.
 * 
 * length() | Retorna a quantidade de caracteres em um texto string.
 */

public class AraySemana {

    public static void main(String[] args) {

        String[] semana = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
        
        System.out.println("Dias da Semana:");
        
        for (int i = 0; i < semana.length; i++) {
            System.out.println(semana[i]);

        }
    }
}