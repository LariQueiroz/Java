 /******************************************************************************
 . Desenvolva um algoritmo que preencha aleatoriamente um vetor
 de 10 posicões com números entre 0 a 100.
 Calcule e escreva o maior, menor e a média desses números.
 
 *******************************************************************************/
 import java.util.Random;
 
 public class ex51 {
     public static void main(String[] args) {
         int[] vetor = new int[10];
         Random random = new Random();
 
         int maior = Integer.MIN_VALUE;
         int menor = Integer.MAX_VALUE;
         int soma = 0;
 
         System.out.println("Valores do vetor:");
 
         
         for (int i = 0; i < vetor.length; i++) {
             vetor[i] = random.nextInt(101);
             System.out.print(vetor[i] + " ");
 
         
             if (vetor[i] > maior) {
                 maior = vetor[i];
             }
             if (vetor[i] < menor) {
                 menor = vetor[i];
             }
 
             soma += vetor[i];
         }
 
         double media = (double) soma / vetor.length;
      System.out.println("Maior valor: " + maior);
         System.out.println("Menor valor: " + menor);
         System.out.printf("Média dos valores: "+ media);
     }
 }
