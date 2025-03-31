import java.util.Scanner;

public class ex11{
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo médio do cliente
        System.out.print("Digite o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        // Variável para armazenar o valor do crédito
        double credito = 0;

        // Cálculo do crédito com base no saldo médio
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            credito = 0;  // Nenhum crédito
        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            credito = saldoMedio * 0.20;  // 20% do saldo médio
        } else if (saldoMedio >= 401 && saldoMedio <= 600) {
            credito = saldoMedio * 0.30;  // 30% do saldo médio
        } else if (saldoMedio > 600) {
            credito = saldoMedio * 0.40;  // 40% do saldo médio
        } else {
            System.out.println("Valor de saldo médio inválido!");
            scanner.close();
            return;  // Encerra o programa caso o saldo médio seja inválido
        }

        // Exibe o saldo médio e o valor do crédito
        System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
        System.out.printf("Valor do crédito concedido: R$ %.2f\n", credito);

        // Fecha o scanner
        scanner.close();
    }
}
