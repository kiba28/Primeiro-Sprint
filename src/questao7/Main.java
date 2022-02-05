package questao7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		int acertos = 0;
		int erros = 0;
		ArrayList<Perguntas> perguntas = new ArrayList<Perguntas>();
		Scanner scan = new Scanner(System.in);

		perguntas.add(new Perguntas("De quem é a famosa frase “Penso, logo existo”?", "Descartes"));
		perguntas.add(new Perguntas("De onde é a invenção do chuveiro elétrico?", "Brasil"));
		perguntas.add(new Perguntas("Quantas casas decimais tem o número pi?", "Infinitas"));
		perguntas.add(new Perguntas("Qual é o menor pais do mundo?", "Vaticano"));
		perguntas.add(new Perguntas("Qual é o maior pais do mundo?", "Rússia"));
		perguntas.add(new Perguntas("Atualmente, quantos elementos químicos a tabela periódica possui?", "118"));
		perguntas.add(new Perguntas("Qual o número mínimo de jogadores numa partida de futebol?", "7"));
		perguntas.add(new Perguntas("Qual pais tem a maior expectativa de vida?", "Japão"));
		perguntas.add(new Perguntas("Qual país tem a menor expectaviva de vida?", "Serra Leoa"));
		perguntas.add(new Perguntas("Quanto tempo a luz do Sol demora para chegar à Terra?", "8 minutos"));

		System.out.println("Digite seu nome: ");
		nome = scan.next();

		for (int i = 0; i < 2; i++) {
			System.out.println(i + 1 + "ª pegunta: \n" + perguntas.get(i).getPergunta());
			System.out.print("Resposta: ");
			String resposta = scan.next();
			if (perguntas.get(i).getResposta().equalsIgnoreCase(resposta)) {
				System.out.println("Acertou!!!\n");
				acertos++;
			} else {
				System.out.println("Você errou! :(");
				System.out.println("A resposta certá é " + perguntas.get(i).getResposta());
				System.out.println();
				erros++;
			}
		}
		System.out.println("Olá " + nome + ". \nVocê acertou: " + acertos + "\nE errou: " + erros);

		scan.close();
	}

}
