/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum LivrosEnum {
   
        ROMANCE("Romance"),
        ACAO("Ação"),
        AVENTURA("Aventura"),
        FANTASIA("Fantasia"),
        SUSPENSE("Suspense"),
        TERROR("Terror");
        
        
          private String categoriaLivro;

    private LivrosEnum(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public String getCategoriaLivro() {
        return this.categoriaLivro;
    }
}

