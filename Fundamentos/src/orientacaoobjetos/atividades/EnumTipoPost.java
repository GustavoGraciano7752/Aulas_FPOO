/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividades;

/**
 *
 * @author Aluno
 */
public enum EnumTipoPost {
    INFORMACAO("Informação"),
    MUSICA("Música"),
    ENTRETENIMENTO("Entretenimento"),
    PUBLICIDADE("Publicidade"),
    NOTICIA("Notícia"),
    CULINARIA("Culinária");
    
  private String tipoPost;

    private EnumTipoPost(String tipoPost) {
        this.tipoPost = tipoPost;
    }

  
}
