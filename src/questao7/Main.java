package questao7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome;
		int acertos = 0;
		int erros = 0;
		String resposta;
		Scanner scan = new Scanner(System.in);
		String[] perguntas = { "De quem é a famosa frase “Penso, logo existo”?",
				"De onde é a invenção do chuveiro elétrico?", "Quantas casas decimais tem o número pi?",
				"Qual é o menor pais do mundo?", "Qual é o maior pais do mundo?",
				"Atualmente, quantos elementos químicos a tabela periódica possui?",
				"Qual o número mínimo de jogadores numa partida de futebol?",
				"Qual pais tem a maior expectativa de vida?", "Qual país tem a menor expectaviva de vida?",
				"Quanto tempo a luz do Sol demora para chegar à Terra?" };

		String[] respostas = { "Descartes", "Brasil", "Infinitas", "Vaticano", "Rússia", "118", "7", "Japão",
				"Serra Leoa", "8 minutos", };

		System.out.println("Digite seu nome: ");
		nome = scan.next();

		for (int i = 0; i < 2; i++) {
			System.out.println(i + 1 + "ª pegunta: \n" + perguntas[i]);
			System.out.print("Resposta: ");
			resposta = scan.next();
			if (respostas[i].equals(resposta)) {
				System.out.println("Acertou!!!\n");
				acertos++;
			} else {
				System.out.println("Você errou! :(");
				System.out.println("A resposta certá é " + respostas[i]);
				System.out.println();
				erros++;
			}
		}
		System.out.println(
				"Olá " + nome + ". \nVocê acertou: " + acertos + " de 10." + "\nE errou: " + erros + " de 10.");

		scan.close();
	}
	
}
