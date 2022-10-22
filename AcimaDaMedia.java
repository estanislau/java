
package acimadamedia;

/**
 *
 * A propriedade length pode ser usada para descobrir o tamanho de um vetor. 
 * Além disso, o tamanho de um vetor pode ser determinado dinamicamente, 
 * por meio de variável, ao invés de um número fixo.
 * 
 */

import java.util.Scanner;

public class AcimaDaMedia
{
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtdeAlunos, qtdeAcimaMedia = 0;
        float soma = 0, media;
        
        System.out.print("Quantos alunos serão informados?: ");
        qtdeAlunos = entrada.nextInt();
        
        //Declarando o vetor usando o valor da 
        //variável qtdeAlunos para a quantidade de elementos:
        float[] notas = new float[qtdeAlunos];
       
        
        //vetor.length é uma propriedade que 
        //traz o número de elementos de um vetor:
        for(int i = 0; i < notas.length; i++)
        {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = entrada.nextFloat();
            soma += notas[i];
        }
        System.out.println();

        //calculando a média a partir 
        //do somatório obtido no laço anterior
        media = soma / qtdeAlunos;
        System.out.println("Média " + media);
        
        System.out.println();
                
        for(int i = 0; i < notas.length; i++)
        {
            if(notas[i] > media)
            {
                System.out.println("Nota " + notas[i] + " acima da média.");
                qtdeAcimaMedia++;
            }
        }
        System.out.println("Foram no total " + qtdeAcimaMedia + " notas acima da média");
    }
}
