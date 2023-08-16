//Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml
// e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, informe
// quantos litros de refrigerante ele comprou.

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de latas: ");
        int quantidadeLatas = leitor.nextInt();

        System.out.print("Informe a quantidade de garrafa 600ml: ");
        int quantidadeGarrafa600 = leitor.nextInt();

        System.out.print("Informe a quantidade de garrafa 2L: ");
        int quantidadeGarrafa2L = leitor.nextInt();

        System.out.print("A quantidade de litros de refrigerante é de " + ((quantidadeLatas * 0.35) + (quantidadeGarrafa600 * 0.6) + (quantidadeGarrafa2L * 2)));
    }
}
