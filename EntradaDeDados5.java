
package entradadedados5;

/**
 *
 * @author adama
 */

import java.util.Scanner;

public class EntradaDeDados5 {

    public static void main(String[] args) {
        /* O argumento de valor “latin1” permite que o usuário 
           informe livremente caracteres com acentuação:
        
           Veja ainda que, caso você informe um nome sem o 
           caractere de espaço, o programa resultará em erro. 
           Isso ocorre porque indexOf() retornará -1 (não encontrado) e 
           substring() usará -1 como limite para a extração do nome, o que é inválido.
        */
        Scanner entrada = new Scanner(System.in, "latin1");
        
                String nome, primeiroNome;
                int fimNome, tamanhoNome;
                
                /*
                 Para entrada de dados de texto, utiliza-se o método nextLine(). 
                 Esse é o método padrão para capturar textos e, basicamente, 
                 obtém todos os caracteres digitados até que o usuário tecle Enter:
                */
                System.out.println("Informe nome e sobrenome: ");
                nome = entrada.nextLine();
                
                // Tamanho do nome ccmpleto:
                tamanhoNome = nome.length();
                /* Encontra o índice no qual ocorre o primeiro 
                   caractere de espaço em branco:
                */
                fimNome = nome.indexOf(" ");
                // Extrai o primeiro nome:
                primeiroNome = nome.substring(0, fimNome);
                
                // Mostra na tela o resultado:
                System.out.println("Tamanho total: " + tamanhoNome + "\nÍndex caracter espaço: " + fimNome + "\nPrimeiro nome: " + primeiroNome);
    }
    
}
