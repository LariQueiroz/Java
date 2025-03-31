/******************************************************************************

  Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
*******************************************************************************/
import java.util.Scanner;
public class ex16{
     Scanner ler = new Scanner (System.in);
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Insira nome do usuario");
		String nome = ler.nextLine();
		
		 for(int i = 0; i <=10; i++){
	    	System.out.println(nome);
	}
}
}