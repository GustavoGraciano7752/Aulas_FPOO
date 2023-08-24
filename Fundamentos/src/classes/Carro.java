/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    
    private String modelo;
    private String marca;
    private String cor;
    private boolean temFreio;
    private int ano;
    private int rodas;
    private int velocidade;

    public Carro(String modelo, String marca, String cor, boolean temFreio, int ano, int rodas, int velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.temFreio = temFreio;
        this.ano = ano;
        this.rodas = rodas;
        this.velocidade = 0;
    }

   

    public void andar(int velocidade){
        System.out.println("Andando");
        this.velocidade = velocidade;
    }
    
    public boolean verificarSeTemFreio(){
        return this.temFreio;
    }
    
      public void freiar(){
        System.out.println("Freiando");
        this.velocidade -= 10;
    }
}
