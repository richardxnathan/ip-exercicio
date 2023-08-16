//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
//Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159).
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o tamanho de A: ");
        double numeroA = leitor.nextDouble();

        System.out.print("Informe o tamanho de B: ");
        double numeroB = leitor.nextDouble();

        System.out.print("Informe o tamanho de C: ");
        double numeroC = leitor.nextDouble();

        System.out.print("A área do triângulo retângulo que tem A por base e C por altura é de " + ((numeroA * numeroC) / 2));
        System.out.print("A área do círculo de raio C é de " + ((numeroC * numeroC) * 3.14159));
        System.out.print("A área do trapézio que tem A e B por bases e C por altura é de " + (((numeroA + numeroB) * numeroC) / 2));
        System.out.print("A área do quadrado que tem lado B é de " + (numeroB * numeroB));
        System.out.print("A área do retângulo que tem lados A e B é de " + (numeroA * numeroB));
    }
}
