/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class TesteClasses {
    public static void main(String[] args) {
        
        Computador computador01 = new Computador(TipoMemoriaEnum.DDR5, 32, ProcessadorEnum.I9, 1000, "Windows");
        
        computador01.verificarMemoria();
        computador01.verificarCapacidade();
        
        System.out.println(computador01);
        
        Sala sala01 = new Sala(20, 5, 4, true, 22);
        
        sala01.verificarSalaNova();
        sala01.verificarSeTemProjetor();
        
        System.out.println(sala01);
        
        Curso curso01 = new Curso("Eletro Eletronica", "Mexe com coisas eletricas", CategoriaEnum.ELETRICA);
        
        curso01.verifcarAprovado();
        curso01.verificarPresencial();
        
        System.out.println(curso01);
    }
}
