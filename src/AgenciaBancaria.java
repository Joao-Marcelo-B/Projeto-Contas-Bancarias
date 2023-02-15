import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class AgenciaBancaria {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Titular> titular;
	static ArrayList<ContaCorrente> contaBancaria;
	
	public static void main(String[] args) {
		contaBancaria = new ArrayList<ContaCorrente>();
		titular = new ArrayList<Titular>();
		cadastrarTitular();
	}
	
	public static void cadastrarTitular() {
		System.out.println("===========================");
		System.out.println("Cadastrando Conta Corrente");
		System.out.println("===========================");
		System.out.print("Digite o nome do titular: ");
		String nome = scan.nextLine();
		System.out.print("Digite o CPF do titular: ");
		String cpf = scan.nextLine();
		System.out.print("Digite o nome do telefone: ");
		String telefone = scan.nextLine();
		System.out.print("Digite a data de nascimento: ");
		String nascimento = scan.nextLine();
		
		String numeroConta = "";
		Random aleatorio = new Random();
		for(int cont = 0; cont < 4; cont++) {
			String numero = Integer.toString(aleatorio.nextInt(9));
			numeroConta += numero;
		}
		numero
		System.out.println(numeroConta);
		
		Titular titular = new Titular(nome, cpf, telefone, nascimento);
		ContaCorrente conta = new ContaCorrente(titular, "3104-0");
		
		contaBancaria.add(conta);
	}

}
