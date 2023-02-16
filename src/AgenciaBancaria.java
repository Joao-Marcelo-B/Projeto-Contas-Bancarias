import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class AgenciaBancaria {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Titular> titularConta;
	static ArrayList<ContaCorrente> contaBancaria;
	
	public static void main(String[] args) {
		contaBancaria = new ArrayList<ContaCorrente>();
		titularConta = new ArrayList<Titular>();
		cadastrarTitular();
		cadastrarContaCorrente();
	}

	public static void operacoes() {
		int operacoes;
		System.out.println("=====================");
		System.out.println("Menu de opcoes");
		System.out.println("=====================");
		System.out.println("1 - Cadastrar nova conta.");
		System.out.println("Digite a opcao desejada: ");
		operacoes = scan.nextInt();

		switch(operacoes) {
			case 1:
				cadastrarContaCorrente();
			break;
		}
	}
	
	public static void cadastrarTitular() {
		System.out.print("Digite o nome do titular: ");
		String nome = scan.nextLine();
		System.out.print("Digite o CPF do titular: ");
		String cpf = scan.nextLine();
		System.out.print("Digite o nome do telefone: ");
		String telefone = scan.nextLine();
		System.out.print("Digite a data de nascimento: ");
		String nascimento = scan.nextLine();

		Titular titular = new Titular(nome, cpf, telefone, nascimento);
		titularConta.add(titular);
	}
	
	public static void cadastrarContaCorrente() {
		cadastrarTitular();
		Random aleatorio = new Random();
		String numeroConta = "";
		for(int cont = 0; cont < 4; cont++) {
			numeroConta += Integer.toString(aleatorio.nextInt(9));
		}
		numeroConta += "-x";
		ContaCorrente contaCorrente = new ContaCorrente(titularConta.get(0), numeroConta);
		contaCorrente.toString();
		contaBancaria.add(contaCorrente);
	}

	public static void clearBuffer(Scanner scan) {
		if(scan.hasNextLine()) {
			scan.nextLine();
		}
	}
}
