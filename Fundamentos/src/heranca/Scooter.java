/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Scooter extends Veiculo{
    private int potenciaBateria;

    public Scooter(int potenciaBateria, String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zeroKm, boolean freioAbs) {
        super(descricao, ano, cor, modelo, marca, valor, zeroKm, freioAbs);
        this.potenciaBateria = potenciaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Scooter{" + "potenciaBateria=" + potenciaBateria + '}';
    }
    
    
}
