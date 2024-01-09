package exercicio01;

import java.util.Date;

public class Cliente {
	
	private String nome, email;
	private Date dtNascimento;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date date) {
		this.dtNascimento = date;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	static void comprar() {
		System.out.println("\n\nOk, relaxe aí... \nO cliente em questão, está escolhendo produtos..."
				+ "\ne passeando pela loja...");
	}
	
}
