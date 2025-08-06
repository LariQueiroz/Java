import java.util.ArrayList;
import java.util.Scanner;

public class ex01ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("\nElementos da lista multiplicados por 2:");
        for (int numero : numeros) {
            System.out.println(numero + " x 2 = " + (numero * 2));
        }

    }
}
