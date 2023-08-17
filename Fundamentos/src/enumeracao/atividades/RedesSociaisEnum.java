/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum RedesSociaisEnum {
   
        INFORMACOES("Informações"),
        MENSAGENS("Mensagens"),
        ENTRETERIMENTO("Entreterimento");
        
        private String gostoRedeSocial;

    private RedesSociaisEnum(String categoriaRedeSocial) {
        this.gostoRedeSocial = categoriaRedeSocial;
    }

    public String getCategoriaRedeSocial() {
        return this.gostoRedeSocial;
    }
    }

