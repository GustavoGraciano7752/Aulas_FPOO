package atividade01;

import java.util.Scanner;

public class emprestimoCasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da casa:");
        double valorCasa = scanner.nextDouble();
        System.out.println("Digite o seu salario:");
        double salario = scanner.nextDouble();
        System.out.println("Digite a quantidade de anos:");
        int anos = scanner.nextInt();
        int meses = anos / 12;
        double prestacao = valorCasa / meses;
        
        if (prestacao < 0.3 * salario) {
            System.out.println("Emprestimo aprovado"); 
        } else {
            System.out.println("Emprestimo negado");
        }
    }
}
