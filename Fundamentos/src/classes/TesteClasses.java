/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class TesteClasses {
    public static void main(String[] args) {
        
        Aluno aluno01 = new Aluno("Roberto", "roberto.socapa_2012MFF@gmail.com", 1234);
        
        System.out.println(aluno01);
        aluno01.estudar();
        aluno01.verificarAprovado();
        System.out.println(aluno01);
    }
}
