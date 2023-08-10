package atividade02;

import java.util.Scanner;

public class salarioIfelse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cargo:");
        String cargo = scanner.nextLine();
         
         
        if (null != cargo) switch (cargo) {
            case "Gerente" -> {
                int salario = 5590;
                double inss = salario * 0.08;
                int convenio = 289;
                double salarioFinal = salario - inss - convenio;
                System.out.println("Seu salario e de: " + salarioFinal);
                }
            case "Supervisor" -> {
                int salario = 4128;
                double inss = salario * 0.07;
                int convenio = 239;
                double salarioFinal = salario - inss - convenio;
                System.out.println("Seu salario e de: " + salarioFinal);
                }
            case "Tecnico" -> {
                int salario = 3789;
                double inss = salario * 0.04;
                int convenio = 189;
                double salarioFinal = salario - inss - convenio;
                System.out.println("Seu salario e de: " + salarioFinal);
                }
            case "Auxiliar" -> {
                int salario = 2345;
                double inss = salario * 0.02;
                int convenio = 156;
                double salarioFinal = salario - inss - convenio;
                System.out.println("Seu salario e de: " + salarioFinal);
                }
            default -> {
            }
        }
        
    }
}
