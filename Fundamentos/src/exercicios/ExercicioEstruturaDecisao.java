/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercicioEstruturaDecisao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Planos do Hotel---");
        System.out.println("1- Basico, apenas jantar incluso - R$89,90 dias da semana - $109,90 final de semana");
        System.out.println("2- Superflex, cafe e jantar incluso - R$109,90 dias da semana - $139,90 final de semana");
        System.out.println("3- Premium, cafe e almoco incluso - R$199,90 dias de semana - $229,90 final de semana");
        System.out.println("4- Master, tudo incluso - R$259,90 dias de semana - R$299,90 final de semana ");
        
        double cafe = 29.99;
        double almoco = 69.99;
        double jantar = 59.99;
        
        System.out.println("Escolha seu plano:");
        int planoHotel = scanner.nextInt();
        System.out.println("Quantos dias de segunda a sexta voce vai ficar?");
        int diaSemana = scanner.nextInt();
        System.out.println("Quantos dias de final de semana voce vai ficar?");
        int diaFinalSemana = scanner.nextInt();
        
        switch (planoHotel) {
            case 1 ->                 {
                    double precoPlano = (diaSemana *  89.9) + (diaFinalSemana * 109.9);
                    double precoAlimentacao = (cafe + almoco) * (diaFinalSemana + diaSemana);
                    double precoTotal = precoPlano + precoAlimentacao;
                    System.out.println("O total do custo da alimentacao: R$" + precoAlimentacao);
                    System.out.println("O total do custo da draria: R$" + precoPlano);
                    System.out.println("O total do seu plano Basico ficou: R$" + precoTotal);
                }
            case 2 ->                 {
                    double precoPlano = (diaSemana *  109.9) + (diaFinalSemana * 139.9);
                    double precoAlimentacao = almoco * (diaFinalSemana + diaSemana);
                    double precoTotal = precoPlano + precoAlimentacao;
                    System.out.println("O total do custo da alimentacao: R$" + precoAlimentacao);
                    System.out.println("O total do custo da draria: R$" + precoPlano);
                    System.out.println("O total do seu plano Superflex ficou: R$" + precoTotal);
                }
            case 3 ->                 {
                    double precoPlano = (diaSemana *  199.9) + (diaFinalSemana * 229.9);
                    double precoAlimentacao = jantar * (diaFinalSemana + diaSemana);
                    double precoTotal = precoPlano + precoAlimentacao;
                    System.out.println("O total do custo da alimentacao: R$" + precoAlimentacao);
                    System.out.println("O total do custo da draria: R$" + precoPlano);
                    System.out.println("O total do seu plano Premium ficou: R$" + precoTotal);
                }
            case 4 ->                 {
                    double precoPlano = (diaSemana *  259.9) + (diaFinalSemana * 299.9);
                    double precoTotal = precoPlano;
                    System.out.println("O total do custo da draria: R$" + precoPlano);
                    System.out.println("O total do seu plano Master ficou: R$" + precoTotal);
                }
            default -> System.out.println("A opcao foi escolhida errada");
        }
    }
}

