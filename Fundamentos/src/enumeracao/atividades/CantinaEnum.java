/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

import enumeracao.StatusEnum;

/**
 *
 * @author Aluno
 */
public enum CantinaEnum {

    SALGADOS("Salgados"),
    DOCES("Doces"),
    LANCHES("Lanches"),
    BEBIDAS("Bebidas"),
    BALAS("Balas"),
    PRATO("Prato de comida"),
    ACOMPANHAMENTOS("Acompanhamentos"),
    PIRULITO("Pirulitos");

    private String gostoComida;

    private CantinaEnum(String categoriaComida) {
        this.gostoComida = categoriaComida;
    }

    public String getCategoriaComida() {
        return this.gostoComida;
    }

}
