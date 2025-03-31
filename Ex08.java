/* 
Ex08 -   Construa um algoritmo que, tendo como
dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente
seu peso ideal utilizando as seguintes fórmulas: Para homens: Peso ideal (P) =
(72,7 * H) – 58 Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7
*/
import java.util.Scanner;
public class ex8
 {  
	public static void main(String [] args) {
	    double h, peso;
	    String s;
	
		Scanner ler = new Scanner(System.in);
		
	    System.out.println("Insira seu sexo: ");
	    s = ler.nextLine();
		
		System.out.println("Insira sua altura: ");
	    h = ler.nextDouble();
		
    	if (s == "feminino"){ 
    	peso = ( 62.1 * h) - 44.7;
    	System.out.println("Seu peso ideal é de: " + peso);
    	}else{
    	peso = (72.7 * h) - 58;
    		System.out.println("Seu peso ideal é de: " + peso);
}
}
}