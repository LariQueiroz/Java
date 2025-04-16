 /******************************************************************************
  
53.Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
       * pesquisar para obter os valores em ordem crescente e decrescente.
    
 *******************************************************************************/
 
 import java.util.Arrays;
 import java.util.Collections;
 import java.util.Scanner;
 
 public class ex53 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Double[] valores = new Double[10];
 
       
         System.out.println("Digite 10 valores reais:");
         for (int i = 0; i < valores.length; i++) {
             System.out.print("Valor " + (i + 1) + ": ");
             valores[i] = scanner.nextDouble();
         }
 
         
         Double[] crescente = valores.clone();
         Arrays.sort(crescente);
         System.out.println("\nValores em ordem crescente:");
         for (double v : crescente) {
             System.out.print(v + " ");
         }
 
         
         Double[] decrescente = valores.clone();
         Arrays.sort(decrescente, Collections.reverseOrder());
         System.out.println("\n\nValores em ordem decrescente:");
         for (double v : decrescente) {
             System.out.print(v + " ");
         }
 
         
         System.out.println("\n\nValores em ordem inversa da entrada:");
         for (int i = valores.length - 1; i >= 0; i--) {
             System.out.print(valores[i] + " ");
         }
 
         
     }
 }