package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
    
        Cliente c01 = new Cliente("Caio");
        System.out.println(c01);
        double valorLocacaoSimples = c01.calcularLocacao(3);
        System.out.println("O valor para a locação do filme é: " + valorLocacaoSimples);
        c01.validarNome(c01.getNome());
        c01.vefificarEmailDominioGoogle(c01.getEmail());
        
        Cliente c02 = new Cliente("Caiú", "caiu@gmail.com");
        System.out.println(c02);
        double valorLocacaoLancamento = c02.calcularLocao(3, true);
         System.out.println("O valor para a locação do filme é: " + valorLocacaoLancamento);
          c02.validarNome(c02.getNome());
          c02.vefificarEmailDominioGoogle(c02.getEmail());
    }
}
