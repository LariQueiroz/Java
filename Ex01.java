/* 
Ex01 - Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.
*/
import java.util.Scanner;
public class Media
 {   
	public static void main(String [] args) {
	
		double p1, p2, soma;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a nota da primeira prova");
		p1 = ler.nextDouble();
		
		System.out.println("Insira a nota da segunda prova");
		p2 = ler.nextDouble();
		
		soma = (p1 + p2) / 2;
		
		if (soma >= 7)
		System.out.println("Aluno(a) aprovado(o)");
		else
		System.out.println("Aluno(a) reprovado(o)");
		
	}	
}
