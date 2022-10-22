/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alunoapp;

public class AlunoApp {
    String nome;
    int matricula;
    String cpf;
    int idade;
    
    public static void main(String[] args) {

        AlunoApp aluno1 = new AlunoApp();

        
        aluno1.nome = "Celso Medeiros";

        System.out.println("Mostrar Alunos:");
        aluno1.mostrarNome(); /* chamando o método criado */
        System.out.println("\nMostrar Alunos:");
        System.out.println("O aluno se chama: " + aluno1.nome);
    }
}