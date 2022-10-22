package aluno2;

public class Aluno2 {

    // Atributos da classe "Aluno":
    String nome;
    int matricula;
    String cpf; 
    
public static void main(String[] args) {

    // Aqui são instanciados três objetos da mesma classe "Aluno2", 
    // e agora é possível decidir qual atributo se quer 
    // utilizar para cada um deles:
    Aluno2 aluno1 = new Aluno2();
    Aluno2 aluno2 = new Aluno2();
    Aluno2 aluno3 = new Aluno2();
    
    aluno1.nome="Celso Medeiros";
    aluno1.matricula=1;
    aluno1.cpf="00134578090";

    aluno2.nome="Camila Alves";
    aluno2.matricula=2;

    aluno3.cpf="0019007890";

    // Criados os objetos, deve-se mostrar os resultados na tela:

    System.out.println("Mostrar Alunos:/n"); // O comando "\n" serve para pular uma linha após o mostrar alunos.

    System.out.println("Nome do aluno1: " + aluno1.nome);
    System.out.println("Matrícula do aluno1: " + aluno1.matricula);
    System.out.println("CPF do aluno1: " + aluno1.cpf);

    // comando "\n" aqui também pula uma linha, mesmo colocado sozinho 
    // dentro do comando System.out.println:
    System.out.println("\n"); 

    System.out.println("Nome do aluno2: " + aluno2.nome);
    System.out.println("Matrícula do aluno2: " + aluno2.matricula);

    System.out.println("\n");
    System.out.println("CPF do aluno3: " + aluno3.cpf);
  
}
}
