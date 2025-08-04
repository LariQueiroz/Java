import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Digite inteiros separados por espaço:");
        String[] entrada = scanner.nextLine().split(" ");

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        if (lista.size() > 4) {
            lista.remove(4);
        } else {
            System.out.println("Lista com menos de 5 elementos, nada removido.");
        }

        System.out.println("Lista resultante: " + lista);
    }
}
