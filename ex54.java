 /******************************************************************************
  
54.Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.
    
 *******************************************************************************/
 import java.util.Scanner;
 
 public class ex54 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         
         System.out.print("Quantos valores deseja inserir? ");
         int n = scanner.nextInt();
 
         int[] numeros = new int[n];
         int contadorPares = 0;
         int produtoImpares = 1;
         boolean temImpar = false;
 
         
         for (int i = 0; i < n; i++) {
             System.out.print("Digite o valor " + (i + 1) + ": ");
             numeros[i] = scanner.nextInt();
 
             if (numeros[i] % 2 == 0) {
                 contadorPares++;
             } else {
                 produtoImpares *= numeros[i];
                 temImpar = true;
             }
         }
 
         
         System.out.println("\nQuantidade de números pares: " + contadorPares);
         if (temImpar) {
             System.out.println("Produto dos números ímpares: " + produtoImpares);
         } else {
             System.out.println("Não há números ímpares para multiplicar.");
         }
 
         
     }
 }