package br.edu.fatecpg.encapsulamento.veiculo.model;

public class Carro {
	private String chassi;
	private String marca;
	private String modelo;
	private String placa;
	private double motor;
	private boolean ligado = false;
	private double tanque;
	//metodo construtor
	
	public Carro(String ch, String mrc, String mod, double motor){
		this.chassi = ch;
		this.marca = mrc;
		this.modelo = mod;
		this.motor = motor;
		
	}
	
	public String getChassi() {
		return this.chassi;
	}
	public void setChassi(String ch) {
		this.chassi = ch;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String mrc) {
		this.marca = mrc;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String mod) {
		this.modelo = mod;
	}
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getMotor() {
		return this.motor;
	}
	public void setMotor(Double motor) {
		this.motor = motor;
	}
	public double getTanque() {
		return this.tanque;
	}
	public void setTanque(Double tanque) {
		this.tanque = tanque;
	}
 
	public void ligar() {
		this.ligado = true;
		System.out.println("Ligou");
		
	}
	
	public double totalTanque(double valorG) {
		double vlTotal = valorG * this.tanque;
		return vlTotal;
	}
	public void andar() {
	if (this.ligado == true) {
		System.out.println("Andando");
	}else {
		System.out.println("Ligue o carro primeiro");
	}
	
	}
	public void desligar() {
		this.ligado = false;
		System.out.println("Desligou");
		
	}

}
