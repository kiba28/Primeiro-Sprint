package questao8;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i != 3) {
			System.out.println("Digite a opção que você deseja e aperte enter: ");
			System.out.println("1. Cadastrar novo usuário.\n2. Entrar com um usúario.\n3. Encerrar o programa.");
			i = scan.nextInt();
			switch (i) {
			case 1: {
				System.out.println();
				System.out.println("Digite o novo login: ");
				String login = scan.next();
				System.out.println("Digite a senha: ");
				String senha = scan.next();
				usuarios.add(new Usuarios(login, senha));
				System.out.println("Usuário criado com sucesso.\n");
				break;
			}
			case 2: {
				if (usuarios.isEmpty()) {
					System.out.println("Nenhum usuario cadastrado, primeiro cadastre um usuario.\n");
				} else {
					System.out.println();
					System.out.println("Digite seu login: ");
					String tempLogin = scan.next();
					int index = -1;
					for (int j = 0; j < usuarios.size(); j++) {
						if (usuarios.get(j).getLogin().equalsIgnoreCase(tempLogin)) {
							index = j;
						}
					}
					if (index >= 0) {
						System.out.println("Digite sua senha: ");
						String senha = scan.next();
						if (usuarios.get(index).getSenha().equals(senha)) {
							loginMsg();
							i = 3;
						} else {
							System.out.println("Senha errada, tente novamente.");
						}
					} else {
						System.out.println("O login digitado não existe. Tente novamente.");
					}
				}
				break;
			}
			case 3: {
				System.out.println("O programa foi encerrado.");
				break;
			}
			default:
				System.out.println("Opção inválida. Digite novamente: ");
			}
		}
		scan.close();
	}

	public static void loginMsg() {
		LocalTime horarioAtual = LocalTime.now();
		if (horarioAtual.isBefore(LocalTime.of(6, 0, 0))) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema.");
		} else if (horarioAtual.isBefore(LocalTime.of(12, 0, 0))) {
			System.out.println("Bom dia, você se logou ao nosso sistema.");
		} else if (horarioAtual.isBefore(LocalTime.of(18, 0, 0))) {
			System.out.println("Boa tarde, você se logou ao nosso sistema.");
		} else {
			System.out.println("Boa noite, você se logou ao nosso sistema.");
		}
	}
}
