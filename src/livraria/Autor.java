package livraria;

public class Autor {
	String nome;
	String email;
	String cpf;
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	void mostraDetalhes(){

		System.out.println("Mostrando detalhes do autor ...");
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("CPF: " + this.cpf);
		System.out.println("--");
	}
}
