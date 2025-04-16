 /******************************************************************************
 52. Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array,
 calcule e apresente a soma das idades.
 Verificar as idades e apresentar se a pessoal é " Melhor idade", " Adulto" ou "Criança".
 *******************************************************************************/
 import java.util.Scanner;
 
 public class ex52 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int[] idades = new int[5];
         int soma = 0;
 
         
         System.out.println("Digite as idades de 5 pessoas:");
         for (int i = 0; i < idades.length; i++) {
             System.out.print("Idade da pessoa " + (i + 1) + ": ");
             idades[i] = scanner.nextInt();
             soma += idades[i];
         }
 
         
         System.out.println("Classificação das pessoas:");
         for (int i = 0; i < idades.length; i++) {
             System.out.print("Pessoa " + (i + 1) + " (Idade: " + idades[i] + "): ");
 
             if (idades[i] < 18) {
                 System.out.println("Criança");
             } else if (idades[i] < 60) {
                 System.out.println("Adulto");
             } else {
                 System.out.println("Melhor idade");
             }
         }
 
         
         System.out.println("Soma total das idades: " + soma);
 
     }
 }