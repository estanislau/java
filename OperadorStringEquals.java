
package operadorstringequals;

/**
 *
 * A classe string, por ser um objeto e não um tipo primitivo, 
 * a comparação entre dois valores string não se dá pelo 
 * operador ==, mas sim por meio do método equals().
 * 
 * Note que a última comparação retorna false mesmo 
 * tendo valores idênticos. Isso acontece porque 
 * com == estão sendo comparadas referências de objetos e não valores. 
 * Por isso, o resultado é false, uma vez que, para “valorC”, 
 * um novo objeto string está sendo instanciado explicitamente. 
 * 
 * Apesar de, em alguns casos, o operador == retornar o resultado esperado, 
 * isso acontece em casos específicos e, por isso, de modo geral, 
 * recomenda-se que, ao comparar dois valores string, 
 * use-se equals() para evitar problemas.
 * 
 */

public class OperadorStringEquals {


    public static void main(String[] args) {
        String valorA = "Este é um texto";
        String valorB = "Este é outro texto";
        String valorC = new String("Este é outro texto");
                
                // Comparando valorA e valorB: 
                System.out.println(valorA.equals(valorB));
                
                // Comparando valorA com um texto equivalente: 
                System.out.println(valorA.equals("Este é um texto"));
                
                // Comparando valores dos objetos:
                System.out.println(valorB.equals(valorC));
                
                // Comparando objetos, e não valores:
                System.out.println(valorB == valorC);
    }
    
}
