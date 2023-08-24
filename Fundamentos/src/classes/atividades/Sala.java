/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Sala {
    
    private int cadeiras;
    private int mesas;
    private int sala;
    private boolean projetor;   
    private int computadores;

    public Sala(int cadeiras, int mesas, int sala, boolean projetor, int computadores) {
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.sala = sala;
        this.projetor = true;
        this.computadores = computadores;
    }
    
    public boolean verificarSeTemProjetor() {
        if (projetor = true) {
            System.out.println("A sala tem projetor");
        } else{
            System.out.println("A sala precisa de um projetor");
        }
        return projetor;
    }
    
    public void verificarSalaNova() {
        if (sala >= 8) {
            System.out.println("A sala é nova");
        } else{
            System.out.println("A sala é velha");
        }
    }

    @Override
    public String toString() {
        return "Sala{" + "cadeiras=" + cadeiras + ", mesas=" + mesas + ", sala=" + sala + ", projetor=" + projetor + ", computadores=" + computadores + '}';
    }
    
    
}
