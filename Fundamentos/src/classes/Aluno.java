/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    
    private String nome;
    private String email;
    private int ra;
    private boolean estudando;
    private double resultadoProva;

    public Aluno(String nome, String email, int ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.estudando = true;
        this.resultadoProva = 4.2;
    }
    
    public boolean estudar() {
        if (estudando = true) {
            System.out.println("O aluno esta estudando");   
        } else{
            System.out.println("O aluno nao esta estudando");
        }
        return estudando;
    }
    
    public double verificarAprovado() {
        if (resultadoProva >= 7) {
            System.out.println("O alunos esta aprovado");
        } else {
            System.out.println("O aluno esta reprovado");
        }
        return resultadoProva;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", estudando=" + estudando + '}';
    }
    
    
    
}
