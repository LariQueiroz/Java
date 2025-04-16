/******************************************************************************

47. Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.

*******************************************************************************/
import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

       
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("\nNúmeros em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}