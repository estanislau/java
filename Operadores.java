
package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        int num1 = 10, num2 = 15, num3 = 20;
        
        System.out.println(num1 > num2); 
        System.out.println(num1 != num2);
        System.out.println(!(num1 < num2));
        System.out.println(num1 < num2 && num2 < num3);
        System.out.println(num1 >= num2 || num1 >= num3);
        System.out.println((num1 > num2 && num2 > num3) || (num2 +10 > num3));
        
    }
    
}
