package br.edu.unifacisa.exercicioxiii;

public class Main {

	public static void mostrarDadosFamilia(Familia membro) {
		System.out.println(membro.dados());
	}
	public static void main(String[] args) {
		
		
		Pai pai = new Pai();
		pai.nome = "Alfredo";
		pai.idade = 70;
		
		Filho filho = new Filho();
		filho.setNome("Vanderlan");
		filho.setIdade(38);
		filho.setEmail("cariocapicui@gmail.com");
		
		Main.mostrarDadosFamilia(pai);
		Main.mostrarDadosFamilia(filho);
		
	}

}
