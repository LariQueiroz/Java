import java.util.ArrayList;
import java.util.Scanner;

public class ex09ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> removerPalavra = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            String palavra = scanner.nextLine();
            removerPalavra.add(palavra);
        }

        removerPalavra.removeIf(palavra -> palavra.length() < 4);

        System.out.println("\nPalavras com 4 ou mais letras:");
        for (String palavra : removerPalavra) {
            System.out.println(palavra);
        }

    }
}

