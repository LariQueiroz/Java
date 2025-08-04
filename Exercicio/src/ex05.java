import java.util.Scanner;
public class ex05 {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        String nomes[] = new String[5];

        for (int i=0; i<5; i++){
            System.out.print("Insira o "+i+ " nome: ");
            nomes[i] = ler.next();
        }
        for (int i=0; i<5; i++){
            System.out.println("Os nomes são: "+ nomes[i]);
        }
    }
}
