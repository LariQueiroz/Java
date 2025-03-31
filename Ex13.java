/******************************************************************************
Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
-
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
*******************************************************************************/

import java.util.Scanner;
public class Ex13 
{

 public static void main(String[] args) {
     
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno (em metros): ");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;

       
        System.out.printf("A área do terreno é: %.2f m²\n", area);

       
        if (area < 100) {
            System.out.println("Classificação: TERRENO POPULAR");
        } else if (area >= 100 && area <= 500) {
            System.out.println("Classificação: TERRENO MASTER");
        } else {
            System.out.println("Classificação: TERRENO VIP");
        }

        scanner.close();
    }
}