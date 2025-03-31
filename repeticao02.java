/******************************************************************************

*******************************************************************************/

import java.util.Scanner;
public class repeticao02 {


 public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.print("Escolha um número ");
        n= ler.nextInt();

       System.out.println("Tabuada do "+ n+ ":");
       for(int i = 0; i <=10; i++){
       System.out.println(n + " X " + i + " = " + (n * i));
       }
    }
}