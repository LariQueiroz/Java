/* 
Ex05 -   Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.
*/
import java.util.Scanner;
public class Codigo
 {  
	public static void main(String [] args) {
	    int ve, np, ss;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor do empréstimo");
		ve = ler.nextInt();
		
		System.out.println("Insira o numero de parcelas");
		np = ler.nextInt();
		
		System.out.println("Insira o salario do solicitante");
		ss = ler.nextInt();
		
    	if (np <= (ss - 0.30))
    	System.out.println("O empréstimo será aprovado");
    	else
    		System.out.println("O empréstimo não será aprovado");
}
}