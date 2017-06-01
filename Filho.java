package br.edu.unifacisa.exercicioxiii;

public class Filho implements Familia {
	
	private Pai pai;
	private String email;

	
	public Filho() {
		pai = new Pai();
	}
	
	public void setNome(String nome) {
		pai.nome = nome;
	}
	
	public String getNome() {
		return pai.nome;
	}
	
	public void setIdade(int idade) {
		pai.idade = idade;
	}
	
	public int getIdade() {
		return pai.idade;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

		
	@Override
	public String dados() {
		return "Nome: " + this.getNome() + " Idade: " + this.getIdade() + " Email: " + this.getEmail();
	}
	
	
}
