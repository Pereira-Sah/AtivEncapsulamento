package br.edu.fatecpg.encapsulamento.veiculo.view;
import br.edu.fatecpg.encapsulamento.veiculo.model.Carro;
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		//instanciando
		 Scanner scan = new Scanner(System.in);
		
		 System.out.println("Digite o tamanho do tanque: ");
		 double tanque = scan.nextDouble();
		 System.out.println("Digite o valor da gasolina: ");
		 double gasolina = scan.nextDouble();
		
		 Carro carroAle = new Carro("ASD123", "RENAULT", "LOGAN", 1.6);
		carroAle.ligar();
		carroAle.andar();
		carroAle.desligar();
			
		carroAle.setTanque(tanque);
		System.out.println(carroAle.totalTanque(gasolina));
	
	
	}
	
}