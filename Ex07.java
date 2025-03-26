/* 
Ex07 -    Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.
*/
import java.util.Scanner;
public class Comissao
 {  
	public static void main(String [] args) {
	    int tv;
	    double soma;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o total vendido pelo funcionário no mês de Abril: ");
	tv = ler.nextInt();
		
    	if (tv > 2000){ 
    	soma = tv * 0.10 + 1200;
    	System.out.println("A comissão é de: " + soma);
    	}else{
    		System.out.println("O funciorario não ganhou comissão");
}
}
}