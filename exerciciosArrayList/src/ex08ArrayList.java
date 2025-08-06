import java.util.ArrayList;
import java.util.Scanner;

public class ex08ArrayList {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidade = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            String nome = ler.nextLine();
            nomes.add(nome);

            System.out.print("Digite o preço de " + nome + ": R$ ");
            double preco = ler.nextDouble();
            precos.add(preco);

           ler.nextLine();
        }

        System.out.println("\nProdutos com preços superiores a R$ 50,00:");
        boolean encontrou = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (precos.get(i) > 50.0) {
                System.out.printf("- %s: R$ %.2f\n", nomes.get(i), precos.get(i));
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto com preço acima de R$ 50,00 foi encontrado.");
        }


    }
}
