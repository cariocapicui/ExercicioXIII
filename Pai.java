package br.edu.unifacisa.exercicioxiii;

public class Pai implements Familia {
	
	 String nome;
	 int idade;
	
		
	public String toString() {
		return "Pai [nome=" + nome + ", idade=" + idade + "]";
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String dados() {
		return "Nome: " + this.getNome() + ", idade: " + this.getIdade();
	}
	
	
	
}
