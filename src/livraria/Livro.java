package livraria;

public class Livro {
		private String nome;
		private String descricao;
		private double valor;
		private String isbn;
		private Autor autor;
		private boolean impresso;
		
		public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return this.descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public double getValor() {
			return this.valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getIsbn() {
			return this.isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public Autor getAutor() {
			return this.autor;
		}

		public void setAutor(Autor autor) {
			this.autor = autor;
		}
		
		
		public Livro(Autor autor){
			this.autor = autor;
			this.isbn = "000-00-00000-00-0";
			this.impresso = true;
			
		}
		
		void adicionaValor(double valor){
			this.valor = valor;
		}
		
		double retornaValor(){
			return this.valor;
		}
		
		void mostrarDetalhes(){
			System.out.println("Mostrando detalhes do Livro ... ");
			System.out.println("Nome: " + this.nome);
			System.out.println("Descricao: " + this.descricao);
			System.out.println("Valor: " + this.valor);
			System.out.println("ISBN: " + this.isbn);
			System.out.println("--");
			if(this.temAutor()){
				autor.mostraDetalhes();
			}
		}
		public boolean aplicaDescontoDe(double porcentagem){
			if(porcentagem > 0.3){
				return false;
			}else if(!this.impresso && porcentagem > 0.15){
				return false;
			}
			
			this.valor -= this.valor * porcentagem;
			return true;
		}
		public boolean temAutor(){
			return this.autor != null;
		}
		
}