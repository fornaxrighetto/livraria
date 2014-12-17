package livraria;

import javax.swing.JOptionPane;

/**
 * @author RONALDO
 * Projeto Livraria
 * Do livro: Desbravando Java e Orientacao a Objetos
 */
public class CalculadoraDeEstoque {
		public static void main(String[] args){
			double livroJava8;
			double livroTDD;
			
			livroJava8 = 59.90;
			livroTDD = 59.90;
			
			double soma = livroJava8 + livroTDD;
			
			//System.out.println("O seu estoque atual é: "+ soma);
			JOptionPane.showMessageDialog(null, "O seu estoque atual é: "+ soma);
			
			int numero = 4;
			int outroNumeroIgual = 4;
			numero = numero + 5;
			
			JOptionPane.showMessageDialog(null, numero);
			JOptionPane.showMessageDialog(null, outroNumeroIgual);
			
			livroJava8 = 60;
			//int numeroInteiro = (int) livroJava8;
			
			if(soma < 150){
				System.out.println("Seu estoque está muito baixo!!!");
			}else if(soma >= 2000){
				System.out.println("Seu estoque esta muito alto!");
			}else{
				System.out.println("Seu estoque esta bom!");
			}
			
			//boolean resultado = soma < 150;
			
			//While
			
			soma = 0;
			int contador = 0;
			
			while(contador < 35){
				double valorDoLivro = 59.90;
				soma = soma + valorDoLivro;
				//soma += valorDoLivro
				contador = contador + 1;
				// contador++
			}
			
			//FOR
			soma = 0;
			for(int cont = 0;cont < 35; cont++){
				soma += 59.90;
			}
			
			//Continue
			
			for(int i = 0; i <= 10; i++){
				if(i == 7){
					continue;
				}
				System.out.println(i);
			}
			
			//Break
			for(int i = 0; i <= 10; i++){
				if(i == 7){
					break;
				}
				System.out.println(i);
			}
			
			
			
		}
				
}
