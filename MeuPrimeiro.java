package meuprimeiro;

import java.util.Scanner;

public class MeuPrimeiro {

    /*
     Fonte: 15/09 - UC06 - Apresentação da unidade 
     curricular + atividades + instalação JAVA
      
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Definição de variável:
        int idade;
        long numero_protocolo;
        boolean aprovado;
        String disciplina;
        char conceito;
        double nota1, nota2, media;

        // Atribuição:
        numero_protocolo = 123456789;
        aprovado = true; // Só aceita "true" ou "false"

        // Entrada de dados:
        System.out.print("Informe a disciplina: ");
        disciplina = entrada.nextLine();

        System.out.print("Informe a idade: ");
        idade = entrada.nextInt();

        System.out.print("Informe a nota 1: ");
        nota1 = entrada.nextDouble();
        
        System.out.print("Informe a nota 2: ");
        nota2 = entrada.nextDouble();

        // Processamento:
        media = (nota1 + nota2) / 2;

        if (media > 7) {
            conceito = 'A';
        } else if (media > 4) {
            conceito = 'N';
        } else {
            conceito = 'R';
        }

        // Saida:
        System.out.println("=========================");
        System.out.println("Sua idade é: " + idade);
        System.out.println("Protocolo de atendimento: " + numero_protocolo);
        System.out.println("Está aprovado?: " + aprovado);
        System.out.println("Disciplina: " + disciplina + " ela possui " + disciplina.length() + " caracteres;");
        System.out.println(disciplina.toUpperCase());
        System.out.println("Conceito: " + conceito);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média de notas: " + media);

        System.out.println("SENAC EAD");
        System.out.print("SENAC EAD\n");
        System.out.print("SENAC EAD");
    }

}