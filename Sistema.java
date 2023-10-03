package TrabalhoLP;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		int opcao = 0;
		conta.setLimite(900);
do {
		System.out.println("voce quer 1- depositar, 2- sacar ou 3- sair:");
		 opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("digite seu nome:");
			teclado.nextLine();
			conta.setProprietario(teclado.nextLine());
			System.out.println("digite o seu saldo atual:");
			conta.setSaldo(teclado.nextDouble());
			System.out.println("digite o valor que deseja depositar:");
			double valor = teclado.nextDouble();
			try {
				conta.depositar(valor);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("------------");
			System.out.println("proprietario: " + conta.getProprietario());
			System.out.println("saldo: " + (conta.getSaldo() + valor));
			System.out.println("------------");
			break;
		case 2:
			System.out.println("digite seu nome:");
			teclado.nextLine();
			conta.setProprietario(teclado.nextLine());
			System.out.println("digite o seu saldo atual:");
			conta.setSaldo(teclado.nextDouble());
			System.out.println("digite o valor que deseja sacar:");
			double valor2 = teclado.nextDouble();
			try {
				conta.sacar(valor2);
			} catch (EstouroDeLimiteException e) {
				System.out.println(e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("------------");
			System.out.println("proprietario: " + conta.getProprietario());
			System.out.println("saldo: " + (conta.getSaldo() - valor2));
			System.out.println("------------");
			break;
		case 3:
			System.out.println("Programa encerrado!");

			break;
		default:
			System.out.println("opção inválida!!");

			break;
		}
		}while(opcao < 4);
	}
}
