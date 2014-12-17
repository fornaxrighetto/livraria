package livraria;

public class Livro {
		String nome;
		String descricao;
		double valor;
		String isbn;
		
		void mostrarDetalhes(){
			System.out.println("Mostrando detalhes do Livro ... ");
			System.out.println("Nome: " + this.nome);
			System.out.println("Descricao: " + this.descricao);
			System.out.println("Valor: " + this.valor);
			System.out.println("ISBN: " + this.isbn);
			System.out.println("--");
			
		}
		
}
