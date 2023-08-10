package atividade02;

import java.util.Scanner;

public class aluguelVeiculo {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("-----Carros-----");
        System.out.println("1- Fiat Argo ");
        System.out.println("2- Fiat Mobi ");
        System.out.println("3- Hyundai Hb20   ");
        System.out.println("Digite qual carro voce quer alugar:");
        int carro = scanner.nextInt();
        System.out.println("Digite quantos Km voce percorreu:");
        int km = scanner.nextInt();
        System.out.println("Digite quantos dias voce alugou:");
        int dias = scanner.nextInt();
        
        if (carro == 1) {
            double precoTotal = km * 2.39 + dias * 98;
            System.out.println("O preco total do pedido e de: R$" + precoTotal);
        } else if (carro == 2) {
            double precoTotal = km * 1.99 + dias * 79;
            System.out.println("O preco total do pedido e de: R$" + precoTotal);
        } else if (carro == 3) {
            double precoTotal = km * 2.99 + dias * 102;
            System.out.println("O preco total do pedido e de: R$" + precoTotal);
        }
    }
}
