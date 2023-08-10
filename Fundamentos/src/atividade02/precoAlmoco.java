package atividade02;

import java.util.Scanner;

public class precoAlmoco {
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Pratos Disponiveis-----");
        System.out.println("1- Arroz, feijao, bife acebolado ");
        System.out.println("2- Arroz, feijao, file de frango ");
        System.out.println("3- Arroz, feijao, brajola   ");
        System.out.println("Digite seu prato:");
        int prato = scanner.nextInt();
        System.out.println("Digite a quantidade:");
        int qntde = scanner.nextInt();
        
        if (prato == 1) {
            double precoTotal = qntde * 19.99;
            System.out.println("O preco total do pedido e de: R$" + precoTotal);
        } else if (prato == 2) {
            double precoTotal = qntde * 18.99;
            System.out.println("O preco total do pedido e de: R$" + precoTotal);
        } else if (prato == 3) {
            double precoTotal = qntde * 23.99;
            System.out.println("O preco total do pedido e de: R$" + precoTotal);
        }
    }
}
