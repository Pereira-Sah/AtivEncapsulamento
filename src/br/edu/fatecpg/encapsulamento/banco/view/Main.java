package br.edu.fatecpg.encapsulamento.banco.view;

import br.edu.fatecpg.encapsulamento.banco.model.ContaBancaria;

import java.util.Scanner;
public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ContaBancaria contaJulia = new ContaBancaria(19000, "Julia");
		
		System.out.println("1- Depositar \n2-Sacar \nDigite a operação: ");
		int op = scan.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Digite o valor para ser depositado: ");
			double valor = scan.nextDouble();
			contaJulia.depositar(valor);
			break;
		
		case 2:
			System.out.println("Digite o valor para ser sacado: ");
			valor = scan.nextDouble();
			contaJulia.sacar(valor);
			break;	
			
		default:
			System.out.println("Opção inválida");
			break;
		}
		
	}

}
