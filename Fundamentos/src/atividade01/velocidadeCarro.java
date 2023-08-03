package atividade01;

import java.util.Scanner;

public class velocidadeCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua velocidade em Km:");
        double velocidade = scanner.nextDouble();
        double multa = (velocidade - 80) * 5;
        
        if (velocidade > 80) {
            System.out.println("Voce foi multado em R$ " + multa);
        } else {
            System.out.println("Voce estava dentro do limite de velocidade");
        }
    }
}
