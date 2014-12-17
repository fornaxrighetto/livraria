package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Java 8 Pratico";
		livro.descricao = "Novos recursos da Linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-78-93590-37-7";
		
		System.out.println(livro.nome);
		System.out.println(livro.descricao);
		System.out.println(livro.valor);
		System.out.println(livro.isbn);
	}
}
