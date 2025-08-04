import java.util.Scanner;
public class ex02 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        int a, b, c;

        System.out.print("Insira o primeiro número: ");
        a = ler.nextInt();
        System.out.print("Insira o segundo número: ");
        b = ler.nextInt();
        System.out.print("Insira o terceiro número: ");
        c = ler.nextInt();

        if ( a>b && a>c) {
            System.out.println("O primeiro número é maior.");
        }
        else if (b>a && b>c) {
            System.out.println("O segundo número é maior.");
        }
        else {
            System.out.println("O terceiro número é maior.");
        }
    }
}
