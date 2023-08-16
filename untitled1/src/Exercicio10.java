//Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma
// fábrica, e informe-o expresso no formato horas:minutos:segundos.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o tempo de duração do evento: ");
        int tempoSegundos = leitor.nextInt();

        int tempoHoras = tempoSegundos / 60 / 60;
        int tempoMinutos = (tempoSegundos / 60) % 60;
        tempoSegundos = tempoSegundos % 60 % 60;

        System.out.println("O evento terá " + tempoHoras + " hora(s), " + tempoMinutos + " minuto(s) e " + tempoSegundos + " segundos.");
    }
}
