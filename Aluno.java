package aluno; // Início da estrutura básica da classe:

public class Aluno { // Fim da estrutura básica da classe:
    
// Atributos da classe "Aluno":
    String nome;
    int matricula;
    String cpf; 


    public static void main(String[] args) { // método "main"
        
        // Aqui é instanciado o primeiro objeto chamado aluno1, 
        // por meio do uso da palavra reservada "new":
        Aluno aluno1 = new Aluno(); 

        // Aqui é colocado o valor “Celso Morais” no atributo nome do aluno1:
        aluno1.nome = "Celso Medeiros";
        
        // Aqui é colocado o valor “1” no atributo matrícula do aluno1:
        aluno1.matricula = 1;

        // Aqui é colocado o valor “0013457890” no atributo cpf do aluno1:
        aluno1.cpf="00134578090";
        

        // Logo abaixo, será utilizado o comando System.out.println, 
        // que é usado para mostrar uma informação na tela do usuário:

        //Comando para mostrar o nome do aluno1:
        System.out.println("Nome do aluno: " + aluno1.nome);

        // Comando para mostrar a matrícula do aluno1:
        System.out.println("Matrícula do aluno: " + aluno1.matricula);

        //Comando para mostrar o cpf do aluno1:
        System.out.println("CPF do aluno: " + aluno1.cpf);
}
    }
