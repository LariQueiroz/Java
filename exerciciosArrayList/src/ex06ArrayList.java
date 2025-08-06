import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ex06ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int Aleatorio = random.nextInt(100); // de 1 a 100
            numeros.add(Aleatorio);
            System.out.print(Aleatorio);
        }

        Collections.sort(numeros);

        System.out.println("Os números em ordem alfabética são: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
