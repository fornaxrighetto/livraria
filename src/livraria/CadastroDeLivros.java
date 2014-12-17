package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-0";
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Pratico";
		livro.descricao = "Novos recursos da Linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-78-93590-37-7";
		
		livro.autor = autor;
		
		livro.mostrarDetalhes();
		
//		System.out.println(livro.nome);
//		System.out.println(livro.descricao);
//		System.out.println(livro.valor);
//		System.out.println(livro.isbn);
		
		Autor outroAutor = new Autor();
		outroAutor.nome = "Paulo Silveira";
		outroAutor.email = "paulo.silveira@caelum.com.br";
		outroAutor.cpf = "987-654-321-0";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Logica de Programação";
		outroLivro.descricao = "Crie os seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		
		outroLivro.autor = outroAutor;
		
		outroLivro.mostrarDetalhes();
		
//		System.out.println(outroLivro.nome);
//		System.out.println(outroLivro.descricao);
//		System.out.println(outroLivro.valor);
//		System.out.println(outroLivro.isbn);
	}
}
