/******************************************************************************
 50- Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
 a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
 b) Mostrar os valores finais com e sem imposto.
 
 *******************************************************************************/
 import java.util.Scanner;
 
 public class ex50 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double[] valoresCompra = new double[10];
         double total = 0;
         double imposto;
 
         
         System.out.println("Digite os 10 valores da compra:");
         for (int i = 0; i < 10; i++) {
             System.out.print("Valor " + (i + 1) + ": R$ ");
             valoresCompra[i] = scanner.nextDouble();
             total += valoresCompra[i];
         }
 
         
         if (total > 1200.00) {
             imposto = total * 0.025;
         } else {
             imposto = total * 0.008;
         }
 
         double totalComImposto = total + imposto;
 
         
         System.out.printf("\n Valor total sem imposto: "+ total);
         System.out.printf("\n Imposto aplicado: "+ imposto);
         System.out.printf("\n Valor total com imposto: "+ totalComImposto);
 
         
     }
 }