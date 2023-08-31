/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividades;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) throws UnsupportedEncodingException {
                System.setOut(new PrintStream(System.out, true, "UTF-8"));
                
        Post post01 = new Post("Bolo de cenoura com cobertura de chocolate, muito gostoso", "Vovó do Edson", EnumTipoPost.CULINARIA);
        post01.classificarPost(3);
        System.out.println(post01);
        
        Post post02 = new Post("Toni Kross vai para a arábia", "TntSports", EnumTipoPost.NOTICIA);
        post01.classificarPost(1);
        System.out.println(post02);
    }
}
