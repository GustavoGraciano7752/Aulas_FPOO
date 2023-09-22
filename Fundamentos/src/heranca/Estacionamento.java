/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Estacionamento {
    public static void main(String[] args) {
    Carro gol = new Carro("Carro bom", 1999, "Azul", "Gol bom", "Volkswagen", 5, 15000, true, true, CambioEnum.AUTOMATICO, CombustivelEnum.GNV);
        System.out.println(gol);
    
        Moto hornet = new Moto("Moto boa", 2021, "Rosa", "Hornet", "Honda", 500000, true, true, CombustivelEnum.GASOLINA, PartidaEnum.ELETRICA);
        System.out.println(hornet);
    }
    
}
