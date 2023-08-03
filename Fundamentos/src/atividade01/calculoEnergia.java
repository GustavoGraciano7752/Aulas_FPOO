package atividade01;

import java.util.Scanner;

public class calculoEnergia {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quanto voce gastou em KW/h:");
        double energia = scanner.nextDouble();
        System.out.println("Digite sua instalacao eletrica, R(residencial), I(industrial) ou C(comercial):");
        char tipoInstalacao = scanner.next().charAt(0);
        
         if (tipoInstalacao == 'I') {
                   if (energia <= 5000) {
                double valorTotal = 0.55 * energia;
                 System.out.println("Voce ira gastar: " + valorTotal);
                   }else{
                       double valorTotal = 0.60 * energia;
                       System.out.println("Voce ira gastar: " + valorTotal);
                   }
                if (tipoInstalacao == 'R') {
                   if (energia <= 500) {
                double valorTotal = 0.40 * energia;
                 System.out.println("Voce ira gastar: " + valorTotal);
                   }else{
                       double valorTotal = 0.65 * energia;
                        System.out.println("Voce ira gastar: " + valorTotal);
                   }
                    if (tipoInstalacao == 'C') {
                   if (energia <= 1000) {
                double valorTotal = 0.55 * energia;
                 System.out.println("Voce ira gastar: " + valorTotal);
                   }else{
                       double valorTotal = 0.60 * energia;
                        System.out.println("Voce ira gastar: " + valorTotal);
                   }
    }
}
