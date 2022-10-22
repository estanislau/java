/*
* 
* TDS - Mód II - Desenvolver Código Orientado a Objetos (660008016A)
*
* Relativo ao atendimento de eventos, o hotel necessita de uma 
* funcionalidade que indique qual de seus dois auditórios é o mais adequado 
* para um evento. O auditório Alfa conta com 150 lugares e espaço para 
* até 70 cadeiras adicionais. O auditório Beta conta com 350 lugares, 
* sem espaço para mais cadeiras. Desenvolva um programa Java que receba 
* o número de convidados do evento e faça uma verificação sobre a quantidade: 
* se for maior que 350 ou se for menor que zero, mostre 
* a mensagem “Número de convidados inválido”. Se o valor informado é válido, 
* mostre na tela qual dos auditórios é o mais adequado. 
* No caso do auditório Alfa, calcule ainda quantas cadeiras adicionais 
* serão necessárias, observando o limite citado acima.
* 
* Autor: Estanislau Gonçalves
* Contato: estanislau@vivaldi.net
*
* Atualizado: 22/10/22  às 10:34
* 
*/

package m02dcooa01e01;

import java.util.Scanner;

public class M02DCOOA01E01 {

    public static void main(String[] args) {
        
        // Declaração de variáveis:
        int convidados;
        
        do{
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Número de convidados: ");
        convidados = entrada.nextInt();
        
        if(convidados > 350 || convidados <= 0){
            System.out.println("Número de convidados inválido.");
        }else{
            if(convidados > 220){
                System.out.println("Utilize o auditório Beta");
            }else{
                if(convidados <= 150){
                    System.out.println("Use o auditório Alfa. ");
                }else{
                    if(convidados > 150 && convidados <= 220){
                        
                        convidados = (convidados - 150);
                        
                        System.out.println("Use o auditório: Alfa");
                        System.out.println("Inclua mais: " + convidados + " cadeiras.");
                        
                    }
                }
            }
        }
        System.out.println();
        
        }while(convidados > 350 || convidados <= 0);
    }
    
}
