/******************************************************************************
  Caixa eletrônico com cédulas disponíveis
 Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa informa quantas cédulas de R$100, R$50,
 R$20, R$10 e R$5 serão entregues, com base nas cédulas disponíveis.
 Caso não seja possível realizar o saque com as cédulas, exiba uma mensagem de erro.
 *******************************************************************************/
 import java.util.Scanner;
 
 public class desafio4
 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         int[] cedulas = {100, 50, 20, 10, 5};
         int[] qtdCedulas = new int[cedulas.length];
         System.out.println(" Caixa Eletrônico ");
         System.out.print("Digite o valor para saque (mínimo R$5): R$ ");
         int valor = scanner.nextInt();
 
         if (valor < 5) {
             System.out.println("valor inválido. O valor mínimo para saque é R$5.");
             return;
         }
 
         int valorRestante = valor;
 
         for (int i = 0; i < cedulas.length; i++) {
             if (valorRestante >= cedulas[i]) {
                 qtdCedulas[i] = valorRestante / cedulas[i];
                 valorRestante = valorRestante % cedulas[i];
             }
         }
 
         if (valorRestante != 0) {
             System.out.println("não é possível sacar este valor com as cédulas disponíveis.");
         } else {
             System.out.println("\n Cédulas entregues:");
             for (int i = 0; i < cedulas.length; i++) {
                 if (qtdCedulas[i] > 0) {
                     System.out.println("R$" + cedulas[i] + ": " + qtdCedulas[i] + " cédula(s)");
                 }
             }
         }
     }
 }
 
 
