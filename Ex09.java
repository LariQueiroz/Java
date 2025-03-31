/******************************************************************************
 Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: •R$ 4,00 para 1 hora de estacionamento •R$ 6,00 para 2 horas
de estacionamento •R$ 1,00 por hora adicional (acima de 2 horas)

*******************************************************************************/
import java.util.Scanner;

public class ex09{
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a hora e minuto de entrada
        System.out.print("Digite a hora de entrada (HE): ");
        int HE = scanner.nextInt();
        System.out.print("Digite o minuto de entrada (ME): ");
        int ME = scanner.nextInt();

        // Solicita a hora e minuto de saída
        System.out.print("Digite a hora de saída (HS): ");
        int HS = scanner.nextInt();
        System.out.print("Digite o minuto de saída (MS): ");
        int MS = scanner.nextInt();

        // Calculando a diferença total em minutos
        int minutosEntrada = HE * 60 + ME;  // Converte hora e minuto de entrada para minutos
        int minutosSaida = HS * 60 + MS;    // Converte hora e minuto de saída para minutos
        int duracaoMinutos = minutosSaida - minutosEntrada;

        // Verifica se o tempo de estacionamento foi negativo (caso a saída tenha ocorrido no dia seguinte)
        if (duracaoMinutos < 0) {
            duracaoMinutos += 24 * 60;  // Adiciona 24 horas em minutos
        }

        // Calcula o número de horas, arredondando para cima se houver minutos adicionais
        int horas = duracaoMinutos / 60;
        if (duracaoMinutos % 60 > 0) {
            horas++;  // Se houver minutos adicionais, considera uma hora inteira a mais
        }

        // Calculando o valor a ser pago com base no número de horas
        double valor = 0;

        if (horas <= 1) {
            valor = 4.00;  // 1 hora ou menos
        } else if (horas == 2) {
            valor = 6.00;  // 2 horas
        } else {
            valor = 6.00 + (horas - 2) * 1.00;  // 2 horas + 1 real por hora adicional
        }

        // Exibe o valor total a ser pago
        System.out.printf("Valor a ser pago: R$ %.2f\n", valor);

        // Fecha o scanner
        scanner.close();
    }
}