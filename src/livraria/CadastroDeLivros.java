package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-0";
		
		Livro livro = new Livro(autor);
		livro.setNome("Java 8 Pratico");
		livro.setDescricao("Novos recursos da Linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-78-93590-37-7");
		
		livro.setAutor(autor);
		
		livro.mostrarDetalhes();
		
//		System.out.println(livro.nome);
//		System.out.println(livro.descricao);
//		System.out.println(livro.valor);
//		System.out.println(livro.isbn);
		
		Autor outroAutor = new Autor();
		outroAutor.nome = "Paulo Silveira";
		outroAutor.email = "paulo.silveira@caelum.com.br";
		outroAutor.cpf = "987-654-321-0";
		
		Livro outroLivro = new Livro(outroAutor);
		outroLivro.setNome("Logica de Programação");
		outroLivro.setDescricao("Crie os seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		
		outroLivro.setAutor(outroAutor);
		
		outroLivro.mostrarDetalhes();
		
//		System.out.println(outroLivro.nome);
//		System.out.println(outroLivro.descricao);
//		System.out.println(outroLivro.valor);
//		System.out.println(outroLivro.isbn);
	}
}