
import java.util.ArrayList;
import java.util.Scanner;

public class ex02ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();


        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }


        System.out.println("\nNomes em ordem inversa:");
        for (int i =  nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }


    }
}