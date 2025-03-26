/* 
Ex03 -   Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.
*/
import java.util.Scanner;
public class Numero
 {   
	public static void main(String [] args) {
	    int n1, n2, n3;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero");
		n1 = ler.nextInt();
		
		System.out.println("Insira o segundo numero");
		n2 = ler.nextInt();
		
		System.out.println("Insira o terceiro numero");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3)
		System.out.println("o primeiro número é maior");
		else if
		(n2 > n1 && n2 > n3)
		System.out.println("o segundo número é maior");
		else if
	    (n3 > n1 && n3 > n2)
	    System.out.println("o terceiro número é maior");
 }
}
