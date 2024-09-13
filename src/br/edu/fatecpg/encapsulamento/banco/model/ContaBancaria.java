package br.edu.fatecpg.encapsulamento.banco.model;

public class ContaBancaria {
	private double saldo;
	private String titular;
	
	public ContaBancaria(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
		System.out.println(this.saldo += valor);
		}else {
			System.out.println("Deposite um valor valido");
		}
	}
	
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			System.out.println(this.saldo -= valor);
		}else {
			System.out.println("Saque um valor valido");
		}
	}
}
 
