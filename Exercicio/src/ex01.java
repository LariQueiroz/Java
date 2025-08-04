import java.util.Scanner;
public class ex01 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int a, b;

        System.out.print("Insira o primeiro número: ");
        a = ler.nextInt();

        System.out.print("Insira o segundo número: ");
        b = ler.nextInt();

        System.out.println("Resultados");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a-b ));
        System.out.println("Multiplicação: " + (a *b ));
        System.out.println("Divisão inteira: " + (a % b));
        System.out.println("Divisão exata: " + ((double)a / b));
    }
}
