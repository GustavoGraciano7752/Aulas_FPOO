/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {
    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade, String sexo) {
        super(nome, email, idade, sexo);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Professor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }

    public void verificarDedicacaoExclusiva(){
            if (dedicacaoExclusiva == true) {
                System.out.println("O professor tem Dedicacao Exclusiva");
            } else{
                System.out.println("O professor nao tem Dedicacao Exclusiva");
            }   
    }
}
