package program;

import java.util.Scanner;

import banco.Cadastro;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cadastro cadastro;
		
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit(y/n)? ");
		char initialValue = sc.next().charAt(0);
		
		if(initialValue == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			cadastro = new Cadastro(numero,nome,deposito);
			
		}else {
			cadastro = new Cadastro(numero,nome);
		}
		System.out.println();
		
		System.out.println(cadastro);
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		cadastro.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(cadastro);
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		double saque = sc.nextDouble();
		cadastro.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(cadastro);
		
		sc.close();
		
		
	}

}
