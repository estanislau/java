
package stringeclasse;

public class StringEclasse {

    public static void main(String[] args) {
        String mensagem = "Aprendendo";
        
        // "length()" retorna a quantidade de caracteres em um texto string.
        int tamanho = mensagem.length(); 
        System.out.println(tamanho);
        
        // "contains()" verifica se a string contém um texto informado
        System.out.println(mensagem.contains("Aprende")); 
        
        // Retorna o índice do caractere no qual inicia um texto informado (ou -1, se não existe)
        System.out.println(mensagem.indexOf("prende"));
        
        // Retorna a string com caracteres minúsculos
        mensagem = mensagem.toLowerCase();
        System.out.println(mensagem);
        
        // Retorna a string com caracteres maiúsculos
        mensagem = mensagem.toUpperCase();
        System.out.println(mensagem);
        
        // Verifica se a string está vazia
        System.out.println(mensagem.isEmpty());
        
        // Retorna uma porção de uma string. 
        // Deve-se informa o índice de início e de fim da extração.
        System.out.println(mensagem.substring(1, 7));

    }
    
}
