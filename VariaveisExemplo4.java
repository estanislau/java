
package variaveisexemplo4;

/**
 *
 * A partir do nome de uma pessoa, verifique o tamanho do nome completo e 
 * extraia o primeiro nome, ignorando os sobrenomes.
 */
public class VariaveisExemplo4 {

   public static void main(String[] args) {
        String nome = "joão da Silva", primeiroNome;
        int fimNome, tamanhoNome;
        
        // Tamanho do nome completo:
        tamanhoNome = nome.length();
        
        // Encontra o índice no qual ocorre o primeiro caractere de espaço:
        fimNome = nome.indexOf(" ");
        
        // Extrai o primeiro nome:
        primeiroNome = nome.substring(0, fimNome);
        
        // Mostra na tela o resultado:
        System.out.println("Tamanho total: " + tamanhoNome + "\nÍndice: " + fimNome + "\nPrimeiro nome: " + primeiroNome);
    }
    
}
