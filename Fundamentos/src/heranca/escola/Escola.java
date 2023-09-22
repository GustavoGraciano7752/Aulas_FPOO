/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Escola {

    public static void main(String[] args) {
        Professor p1 = new Professor(true, "Moises Olimpio", "moises@gmail.com", 22, "Masculino");
        System.out.println(p1);
        System.out.println("-----------------------------------------------------------");
        p1.verificarDedicacaoExclusiva();
        System.out.println("-----------------------------------------------------------");
        Professor p2 = new Professor(false, "Flavia", "flavia@yahoo.com", 79, "Feminino");
        System.out.println(p2);
        System.out.println("-----------------------------------------------------------");
        p2.verificarDedicacaoExclusiva();
        System.out.println("-----------------------------------------------------------");
        Aluno a1 = new Aluno("edfwef13r324", "Amanda Silvano", "amanda@gmail.com", 17, "Feminino");
        System.out.println(a1);
        System.out.println("-----------------------------------------------------------");
        System.out.println("O aluno possui um gmail? " + a1.verificarDominioEmailGmail(a1.getEmail()));
        System.out.println("O aluno possui um email yahoo? " + a1.verificarDominioEmailYahoo(a1.getEmail()));
        System.out.println("O numero de caracteres do ra do aluno e: " + a1.getRa().length());
        System.out.println("-----------------------------------------------------------");
        Aluno a2 = new Aluno("2345jfksa", "Murilo", "boqueta@yahoo.com", 0, "Feminino");
        System.out.println(a2);
        System.out.println("-----------------------------------------------------------");
        System.out.println("O aluno possui um email yahoo? " + a2.verificarDominioEmailYahoo(a2.getEmail()));
        System.out.println("O aluno possui um gmail? " + a2.verificarDominioEmailGmail(a2.getEmail()));
        System.out.println("O numero de caracteres do ra do aluno e: " + a2.getRa().length());
        System.out.println("-----------------------------------------------------------");

        
    }

}
