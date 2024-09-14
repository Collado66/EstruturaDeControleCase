/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturadecontrolecase;

/**
 *
 * @author marce
 */


import java.util.Scanner;

public class EstruturaDeControleCase {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número de 1 a 7
        System.out.print("Digite um número (1-7): ");
        int dia = scanner.nextInt();

        // Estrutura switch-case para determinar o dia da semana
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
                break;
        }

        // Fechar o scanner
        scanner.close();
    }
}
