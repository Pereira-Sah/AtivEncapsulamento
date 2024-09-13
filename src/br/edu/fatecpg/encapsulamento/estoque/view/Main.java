package br.edu.fatecpg.encapsulamento.estoque.view;
import br.edu.fatecpg.encapsulamento.estoque.model.Produtos;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Produtos produto = new Produtos("Camisa", 59.9, 220);
		
		System.out.println("Insira o nome do produto: ");
		String nome = scan.nextLine();
		
		System.out.println("Insira o valor do produto: ");
		double preco = scan.nextDouble();
		
		System.out.println("Insira a quantidade no estoque");
		int quantidadeEstoque = scan.nextInt();
		
		
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setQuantidadeEstoque(quantidadeEstoque);
		
		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		System.out.println(produto.getQuantidadeEstoque());
		}
	}
	
