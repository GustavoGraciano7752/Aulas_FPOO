package atividade01;

import java.util.Scanner;

public class calculoPassagem {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distancia em Km:");
        double distancia = scanner.nextDouble();
        
          
        if (distancia >= 200) {
            double custo = distancia * 0.45;
            System.out.println("Sua viagem ira custar: R$ " + custo);
        } else {
            double custo = distancia * 0.50;
            System.out.println("Sua viagem ira custar: R$ " + custo);   
        }
        
    }
}
