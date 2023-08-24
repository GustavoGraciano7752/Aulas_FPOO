/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum MarcaEnum {
    HONDA("Honda"),
    CHEVROLET("Chevrolet"),
    AUDI("Audi"),
    PORSCHE("Porsche"),
    FERRARI("Ferrari"),
    BUGATTI("Bugatti"),
    LANBORGHINI("Lanborghini"),
    ALFA_ROMEU("Alfa Romeu"),
    WOLKSVAGEN("Wolksvagen"),
    PAGANI("Pagani");
    
    private String marca;

    private MarcaEnum(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    
    
}
