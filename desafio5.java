/******************************************************************************
 Simulador de empréstimo com juros compostos
 Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar.
 Calcule o valor final com juros compostos de 2% ao mês.
 Mostre o valor final e o valor de cada parcela. Permita simular vários empréstimos.
 *******************************************************************************/
 import java.util.Scanner;
 
 public class desafio5 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         final double TAXA_JUROS = 0.02;
         System.out.println(" Simulador de Empréstimo com Juros Compostos ");
 
         boolean continuar = true;
 
         while (continuar) {
           
             System.out.print("\nDigite o valor do empréstimo: R$ ");
             double valorEmprestimo = scanner.nextDouble();
 
 
             System.out.print("Digite a quantidade de parcelas: ");
             int parcelas = scanner.nextInt();
 
             
             double montante = valorEmprestimo * Math.pow(1 + TAXA_JUROS, parcelas);
             double valorParcela = montante / parcelas;
 
           
             System.out.printf("\n Valor final com juros: R$ %.2f\n", montante);
             System.out.printf("Valor de cada parcela (%d): R$ %.2f\n", parcelas, valorParcela);
 
             System.out.print("\nDeseja simular outro empréstimo? (s/n): ");
             String resposta = scanner.next();
 
             if (!resposta.equalsIgnoreCase("s")) {
                 continuar = false;
                 System.out.println("Encerrando o simulador. Obrigado!");
             }
         }
     }
 }