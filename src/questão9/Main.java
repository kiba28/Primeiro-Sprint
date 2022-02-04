package questão9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroFunc = 0;

		System.out.println("Digite o numero de funcionarios da empresa: ");
		numeroFunc = scan.nextInt();
		Funcionarios[] funcionarios = new Funcionarios[numeroFunc];

		for (int i = 0; i < numeroFunc; i++) {
			scan.nextLine();
			System.out.println("Digite o nome do " + (i + 1) + "º funcionario: ");
			String nome = scan.nextLine();
			System.out.println("Digite o salário do " + (i + 1) + "º funcionario: ");
			double salario = scan.nextDouble();
			funcionarios[i] = new Funcionarios(nome, salario);
		}

		for (Funcionarios funcionarios2 : funcionarios) {
			System.out.println();
			if (funcionarios2.getBonus() < 0) {
				System.out.printf("Funcionário %s %nSalário: %.2f %nDesconto: %.2f %nSalário Liquido: %.2f%n",
						funcionarios2.getNome(), funcionarios2.getSalario(), funcionarios2.getBonus(),
						funcionarios2.getSalarioLiquido());
			} else {
				System.out.printf("Funcionário %s %nSalário: %.2f %nBônus: %.2f %nSalário Liquido: %.2f%n",
						funcionarios2.getNome(), funcionarios2.getSalario(), funcionarios2.getBonus(),
						funcionarios2.getSalarioLiquido());
			}
		}
		scan.close();
	}

}
