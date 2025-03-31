/******************************************************************************
 Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.

*******************************************************************************/
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o ano de nascimento do rapaz
        System.out.print("Digite o ano de nascimento do rapaz: ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual
        int anoAtual = 2025;  // Você pode usar a classe LocalDate para pegar o ano atual dinamicamente

        // Calcula a idade do rapaz
        int idade = anoAtual - anoNascimento;

        // Verifica a situação do alistamento militar
        if (idade < 18) {
            // Se a idade for menor que 18, informa quantos anos faltam para o alistamento
            int anosFaltando = 18 - idade;
            System.out.printf("Faltam %d anos para o alistamento.\n", anosFaltando);
        } else if (idade == 18) {
            // Se a idade for exatamente 18, informa que é o ano do alistamento
            System.out.println("É o ano do alistamento.");
        } else {
            // Se a idade for maior que 18, informa quantos anos já se passaram
            int anosPassados = idade - 18;
            System.out.printf("Você já deveria ter se alistado há %d anos.\n", anosPassados);
        }

        // Fecha o scanner
        scanner.close();
    }
}