package atividade02;

import java.util.Scanner;

public class contrucaoImovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura do imovel:");
        int largura = scanner.nextInt();
        System.out.println("Digite o Comprimento do imovel:");
        int comprimento = scanner.nextInt();
        int area = largura * comprimento;
        
        if (area <= 250) {
            double custoTotal = area * 8.50;
            System.out.println("O custo do imovel sera de: R$" +custoTotal);
        } else if (area <= 350) {
            double custoTotal = area * 9.50;
            System.out.println("O custo do imovel sera de: R$" +custoTotal);
        } else if (area >= 350) {
            double custoTotal = area * 11.50;
            System.out.println("O custo do imovel sera de: R$" +custoTotal);
        } 
    }
}
