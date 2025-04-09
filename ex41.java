/******************************************************************************
 
 41 - O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  

 *******************************************************************************/
 import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        double pesoPrato;
        double resultado;
       
        Scanner scanner = new Scanner(System.in);
       
       System.out.print("Insira o peso do prato do cliente: ");
       pesoPrato = scanner.nextDouble();
       
       resultado = pesoPrato * 12 - 0.5;
       
       System.out.println("O preço a pagar é de: "+resultado);
    }
}