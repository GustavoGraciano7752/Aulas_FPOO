/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scannerProduto = new Scanner(System.in);
        
        System.out.println("---Bem vindo ao GuGracinha's Lanches---");
        System.out.println("---Produtos Disponiveis---");
        System.out.println("1- Gugu's Simple - R$15,99");
        System.out.println("2- Gugu's Salad - R$19,99");
        System.out.println("3- Gugu's Cheddar - R$22,99");
        System.out.println("4- Gugu's Bacon - R$23,99" );
        System.out.println("5- Gugu's Master - 28,99");
    
        System.out.println("Escolha sua opcao :D");
        int escolha = scannerProduto.nextInt();
        
        switch (escolha) {
            case 1 ->                 {
                    double precoItem = 15.99;
                    System.out.println("Voce deseja refri? O custo do refri e de R$5,50. S para sim e N para nao");
                    String refri = scannerProduto.next();
                    if ("S".equals(refri)) {
                        double valorTotal = precoItem + 5.5;
                        System.out.println("O valor total do seu pedido e de R$" + valorTotal);
                    } else if ("N".equals(refri)){
                        System.out.println("O valor total do seu pedido e de R$" + precoItem);
                    }                  }
            case 2 ->                 {
                    double precoItem = 19.99;
                    System.out.println("Voce deseja refri? O custo do refri e de R$5,50. S para sim e N para nao");
                    String refri = scannerProduto.next();
                    if ("S".equals(refri)) {
                        double valorTotal = precoItem + 5.5;
                        System.out.println("O valor total do seu pedido e de R$" + valorTotal);
                    } else if ("N".equals(refri)){
                        System.out.println("O valor total do seu pedido e de R$" + precoItem);
                    }                  }
            case 3 ->                 {
                    double precoItem = 22.99;
                    System.out.println("Voce deseja refri? O custo do refri e de R$5,50. S para sim e N para nao");
                    String refri = scannerProduto.next();
                    if ("S".equals(refri)) {
                        double valorTotal = precoItem + 5.5;
                        System.out.println("O valor total do seu pedido e de R$" + valorTotal);
                    } else if ("N".equals(refri)){
                        System.out.println("O valor total do seu pedido e de R$" + precoItem);
                    }                  }
            case 4 ->                 {
                    double precoItem = 23.99;
                    System.out.println("Voce deseja refri? O custo do refri e de R$5,50. S para sim e N para nao");
                    String refri = scannerProduto.next();
                    if ("S".equals(refri)) {
                        double valorTotal = precoItem + 5.5;
                        System.out.println("O valor total do seu pedido e de R$" + valorTotal);
                    } else if (refri == "N"){
                        System.out.println("O valor total do seu pedido e de R$" + precoItem);
                    }                  }
            case 5 ->                 {
                    double precoItem = 28.99;
                    System.out.println("Voce deseja refri? O custo do refri e de R$5,50. S para sim e N para nao");
                    String refri = scannerProduto.next();
                    if (refri == "S") {
                        double valorTotal = precoItem + 5.5;
                        System.out.println("O valor total do seu pedido e de R$" + valorTotal);
                    } else if (refri == "N"){
                        System.out.println("O valor total do seu pedido e de R$" + precoItem);
                    }                  }
            default -> {
            }
        }
            
    }
}
    
    

