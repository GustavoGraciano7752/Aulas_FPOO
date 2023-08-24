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
        
        Carro carro01 = new Carro("Celta Turbinado", MarcaEnum.LANBORGHINI, CorEnum.VERMELHO, true, 2000, 4, 0);
        
        System.out.println(carro01);
        
        carro01.andar(20);
        carro01.andar(60);
        carro01.andar(100);
        
        carro01.freiar();
        carro01.freiar();
        
        System.out.println(carro01);
    }
}
