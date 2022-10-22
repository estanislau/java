package araygol;

/**
 *
 * O programa perguntará para o usuário 
 * a quantidade de partidas que ele deseja somar de gols.
 * 
 * Em seguida, será solicitado para digitar o número de
 * gols por partida, e no fim, será realizada a soma.
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class ArayGol {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("-------- GOLS POR PARTIDA --------");
        System.out.print("Digite o número de partidas: ");
            int partidas = entrada.nextInt();
            
        int [] gol = new int[partidas];
        int soma = 0;
            
        for(int i = 0; i < gol.length; i++){
            System.out.print("Digite os gols da " + (i + 1) + " partida: ");
            gol[i] = entrada.nextInt();
            
            soma += gol[1];
            
        }
        System.out.println("A soma dos gols é " + soma);
        
    }
    
}
