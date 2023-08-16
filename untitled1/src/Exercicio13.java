//Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o
// carro Y sai com velocidade constante de 90 Km/h. Em uma hora (60 minutos) o carro Y consegue se distanciar
// 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos. Leia a distância
// (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a distância em km para descobrir o tempo:  ");
        int distancia = leitor.nextInt();

        System.out.print("O carro Y leva " + (distancia * 2) + " minutos para tomar essa distância do outro carro");
    }
}
