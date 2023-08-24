/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Computador {
    
    private TipoMemoriaEnum tipoMemoria;
    private int memoria;
    private ProcessadorEnum processador;
    private int capacidadeDiscoRigido;
    private String sistemaOperacional;

    public Computador(TipoMemoriaEnum tipoMemoria, int memoria, ProcessadorEnum processador, int capacidadeDiscoRigido, String sistemaOperacional) {
        this.tipoMemoria = tipoMemoria;
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    public void verificarCapacidade() {
        if (capacidadeDiscoRigido >=500) {
            System.out.println("Voce tem bastante espaco");
        } else {
            System.out.println("Voce tem pouco espaco");
        }
           
    }
    
    public void verificarMemoria() {
        if (memoria >= 8) {
            System.out.println("Voce tem bastante memoria ram");
        } else{
            System.out.println("Voce tem pouca memoria ram");
        }
    }
}
