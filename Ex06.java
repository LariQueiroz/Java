/* 
Ex06 -    Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.
*/
import java.util.Scanner;
public class Imparpar
 {  
	public static void main(String [] args) {
	    int numero;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro qualquer");
		numero = ler.nextInt();
		
    	if (numero%2==0) 
    	System.out.println("O numero é par");
    	else
    		System.out.println("O numero é impar");
}
}