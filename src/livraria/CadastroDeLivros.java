package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Java 8 Pratico";
		livro.descricao = "Novos recursos da Linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-78-93590-37-7";
		
		livro.mostrarDetalhes();
		
//		System.out.println(livro.nome);
//		System.out.println(livro.descricao);
//		System.out.println(livro.valor);
//		System.out.println(livro.isbn);
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Logica de Programa��o";
		outroLivro.descricao = "Crie os seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		
		outroLivro.mostrarDetalhes();
		
//		System.out.println(outroLivro.nome);
//		System.out.println(outroLivro.descricao);
//		System.out.println(outroLivro.valor);
//		System.out.println(outroLivro.isbn);
	}
}
