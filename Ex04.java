/* 
Ex04 -   A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.
*/
import java.util.Scanner;
public class Empresa
 {  
	public static void main(String [] args) {
	    double salario, soma;
	    int ts;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o salário");
		salario = ler.nextInt();
		
		System.out.println("Insira o tempo de serviço");
		ts = ler.nextInt();
		
    	if (ts >= 5){
	    soma = salario * 0.20 + salario;
	    System.out.println("O novo salário é de: " + soma);
	    }else {
	    soma = salario * 0.10 + salario;
	    System.out.println("O novo salário é de: " + soma);
 }
}
}