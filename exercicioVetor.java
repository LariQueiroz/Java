/******************************************************************************
desenvolver um programa para ler o nome e idade de 5 pessoas. Guardar esses dados em Array.
Apresentar o nome e a idade das pessoas maiores de idade

*******************************************************************************/
import java.util.Scanner;
public class exercicioVetor
{
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String[] nomes = new String[5];
        int[] idades = new int[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();

        System.out.println("\nPessoas maiores de idade:");
       } for (int i = 0; i < 5; i++) {
            if (idades[i] >= 18) {
                System.out.println(nomes[i] + " - " + idades[i] + " anos");
            }
        }
        }
}  
 