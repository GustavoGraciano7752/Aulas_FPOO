package atividade01;

import java.util.Scanner;

public class calculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        double salario = scanner.nextDouble();
        
        
        if (salario >= 1350) {
            double aumento = salario + (salario * 10/100);
            System.out.println("Seu salario com aumento e: " + aumento);
        } else {
            double aumento = salario + (salario * 15/100);
            System.out.println("Seu salario com aumento e: " + aumento);
            
        }
    }
}
