/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private double nota;
    private boolean presencial;

    public Curso(String nome, String descricao, CategoriaEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.nota = 10;
        this.presencial = true;
    }
    
    public void verifcarAprovado() {
        if (nota >= 5) {
            System.out.println("Aluno esta aprovado");
        } else{
            System.out.println("Aluno esta reprovado");
        }
    }
    
    public boolean verificarPresencial() {
        if (presencial = true) {
            System.out.println("O curso e presencial");
        } else {
            System.out.println("O curso é online");
        }
        return presencial;
    }
    
}
