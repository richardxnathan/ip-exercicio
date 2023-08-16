//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
// p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula,
// segundo a fórmula:
//
//\normalsize&space;distancia=\sqrt{(x_{2}-x_{1})^2+(y_{2}-y_{1})^2}

import java.util.Scanner;

public class Exercicio12 {
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
