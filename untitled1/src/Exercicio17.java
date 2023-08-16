//Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais
// e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho)
// e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre
// o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda.
// Ao final informe o nome, o salário bruto e o salário líquido do funcionário

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome do funciário: ");
        String nome = leitor.nextLine();

        System.out.print("Informe o número de horas trabalhadas: ");
        int quantidadeHoras = leitor.nextInt();

        System.out.print("Informe o número de dependentes: ");
        int quantidadeDependentes = leitor.nextInt();

        System.out.println("O salário bruto do funcionário é de R$" + (quantidadeHoras * 10) + (quantidadeDependentes * 60));
        System.out.print("O salário líquido do funcionário é de R$" + ((((quantidadeHoras * 10) * 0.915) + ((quantidadeHoras * 10) * 0.95)) / 2) + (quantidadeDependentes * 60));
    }
}
