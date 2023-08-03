package atividade01;

import java.util.Scanner;

public class areaDoCirculo {
    public static void main(String[] args) {
        
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu raio:");
        double raio = scanner.nextDouble();
        double area = raio * raio * pi;
        System.out.println("A area do circulo e: " + area);
            
        
    }
}
