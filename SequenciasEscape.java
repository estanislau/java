
package sequenciasescape;

public class SequenciasEscape {

    /**
     * String e char contam com alguns caracteres esepciais chamados
     * "sequênciasa de escape".
     * 
     * As principais são: 
     * 
     * \t (tab)
     * \n (quebra de linha)
     * \' (aspas simples no texto)
     * \" (aspas duplas no texto)
     * \\ (barra inversa no texto
     */
    public static void main(String[] args) {
        System.out.println("linha 1 de texto \nlinha 2 de texto");
        System.out.println("linha  de texto \n\tlinha 4 de texto");
        System.out.println("\'linha 5 de texto\nlinha 6 de texto\'");
        System.out.println("\"linha 7 de texto\nlinha 8 de texto\"");
        System.out.println("\\linha 9 de texto\n linha 10 de texto\\");
    }
    
}
