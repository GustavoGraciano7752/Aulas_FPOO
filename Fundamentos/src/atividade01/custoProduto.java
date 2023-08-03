package atividade01;

import java.util.Scanner;

public class custoProduto {
    public static void main(String[] args) {
        
   
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do seu produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preco do seu produto:");
        double precoProduto = scanner.nextDouble();
        System.out.println("Digite a quantidade do seu produto:");
        int qtdeProduto = scanner.nextInt();
        System.out.println("Digite sua forma de pagamento, C(credito) ou D(debito):");
        char formaPagamento = scanner.next().charAt(0);
        
        if (formaPagamento == 'D') {
                   if (precoProduto <= 100) {
                double valorTotal = precoProduto - 5 * precoProduto /100 * qtdeProduto;
                System.out.println("Produto: " + nome);
                System.out.println( "Quantidade: " + qtdeProduto);
                System.out.println("Valor Total: " + valorTotal);
            } else {
                double valorTotal = precoProduto - 3 * precoProduto /100 * qtdeProduto;
                       System.out.println("Produto: " + nome);
                       System.out.println( "Quantidade: " + qtdeProduto);
                       System.out.println("Valor Total: " + valorTotal);
                       
            }      
        if (formaPagamento == 'C') {
                System.out.println("Digite o numero de parcelas: ");
                int numeroParcelas = scanner.nextInt();
                double valorTotal = precoProduto * qtdeProduto;
                       var valorParcela = (precoProduto * qtdeProduto) /numeroParcelas;
                       System.out.println("Produto: " + nome);
                       System.out.println( "Quantidade: " + qtdeProduto);
                       System.out.println("Valor total de cada parcela: " + valorParcela);
                
                    
            
                   
        }
     
}
   
    }
}
    
