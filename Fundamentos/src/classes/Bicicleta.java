/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    
     // Atributos da classe, características da bicicleta 
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;
    
    
    
    // Construtor sem argumentos (parâmetros)
    public Bicicleta() {
    }
    
    
    
    // Construtor com argumentos (parâmetros)
    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchas, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    
    
    
    // Métodos (ações da bicicleta)
    public void andar(int velocidade){
        System.out.println("Andando");
        this.velocidade = velocidade;
    }
    
    public boolean verificarSeTemFreio(){
        return this.temFreio;
    }
    
      public void freiar(){
        System.out.println("Freiando");
        this.velocidade -= 1;
    }
    
    //toString

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", temMarchas=" + temMarchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    
    
}
