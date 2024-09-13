package br.edu.fatecpg.encapsulamento.estoque.model;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	


	public Produtos(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		if(preco > 0)
		{
			this.preco = preco;
		}
		else
		{
			System.out.println("Digite um valor válido.");
		}
	}
	
	
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque >= 0) {
			this.quantidadeEstoque = quantidadeEstoque;
		}
		else
		{
			System.out.println("Digite um valor válido.");
		}
	}
	
	
	
}