package aluno3;

public class Aluno3 {

    String nome;
    int matricula;
    String cpf;
    int idade;  

    // Aqui, será criado o primeiro método do tipo void, 
    // ou seja, não retorna nenhum valor de variável:
public static void main(String[] args) {

        Aluno3 aluno1 = new Aluno3();

        
        aluno1.nome = "Celso Medeiros";

        System.out.println("Mostrar Alunos:");
        aluno1.mostrarNome(); /* chamando o método criado */
        System.out.println("\nMostrar Alunos:");
        System.out.println("O aluno se chama: " + aluno1.nome);
    }
}