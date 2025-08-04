import java.util.Scanner;
public class ex03 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);

        System.out.print("escolha um número entre 1 e 3: ");
        int numero = ler.nextInt();

        switch (numero) {
            case 1:
                System.out.println("O número inserido foi o 1.");
                break;
            case 2:
                System.out.println("O número inserido foi o 2.");
                break;
            case 3:
                System.out.println("O número inserido foi o 3.");
                break;
            default:
                System.out.println("O número é invalido. Digite um número entre 1 e 3");

        }
    }
}
