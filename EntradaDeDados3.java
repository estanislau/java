
package entradadedados3;

/**
 *
 * Uso da classe Scanner para entrada de dados.
 * 
 * Considerando que a conversão de uma temperatura (T) de Celsius 
 * para Farenheit é calculada por (TºC x 1,8) + 32 e que a conversão 
 * para Kelvin se dá por TºC + 273,15, monte a aplicação Java que 
 * converta graus Celsius em Farenheit e Kelvin. 
 * O usuário informará a temperatura em Celsius.
 * 
 * É importante ressaltar que, apesar de, no código, 
 * ser preciso expressar números com casas decimais 
 * sempre separando-os com ponto, ao informar via console 
 * pode ser necessário separar com vírgula a porção decimal. 
 * Isso ocorre de acordo com a configuração de localização da máquina. * 
 * 
 */

import java.util.Scanner;

public class EntradaDeDados3 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        float celsius, farenheit, kelvin;
        
        System.out.print("Informe a temperatura em ºC: ");
        celsius = entrada.nextFloat();
        
        farenheit = celsius * 1.8f + 32;
        kelvin = celsius + 2734.15f;
        
        System.out.println(celsius + "ºC: correspondem a " + farenheit + "F e " + kelvin + "K.");
    }
    
}
