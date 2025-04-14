/******************************************************************************
 Faça um programa em Java para resolver a equação de 2º grau.        
         Pedir para o usuário entrar com as variáveis A, B e C .
         Mostrar o valor de x1, x2 e delta.
       
         Usar a biblioteca:
           import java.lang.Math;
           Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
           Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
           *Usar double se resultar em números decimais
 *******************************************************************************/
 import java.util.Scanner;
 import java.lang.Math;
 
 public class desafio6 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.println(" Calculadora de Equação do 2º Grau ");
 
       
         System.out.print("Digite o valor de A: ");
         double a = scanner.nextDouble();
 
         System.out.print("Digite o valor de B: ");
         double b = scanner.nextDouble();
 
         System.out.print("Digite o valor de C: ");
         double c = scanner.nextDouble();
 
         if (a == 0) {
             System.out.println("isso não é uma equação de 2º grau (A não pode ser 0).");
             return;
         }
 
         double delta = Math.pow(b, 2) - 4 * a * c;
 
         System.out.printf("\nΔ (delta) = %.2f\n", delta);
 
         
         if (delta < 0) {
             System.out.println("A equação não possui raízes reais.");
         } else {
             
             double x1 = (-b + Math.sqrt(delta)) / (2 * a);
             double x2 = (-b - Math.sqrt(delta)) / (2 * a);
 
             System.out.printf("x₁ = %.2f\n", x1);
             System.out.printf("x₂ = %.2f\n", x2);
         }
     }
 }