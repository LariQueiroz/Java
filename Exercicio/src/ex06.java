import java.util.Scanner;
public class ex06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int soma=0;
        int v[]= new int [10];

        for (int i=0;i<10;i++){
            System.out.print("Insira o "+i+"º número: ");
            v[i]=ler.nextInt();
            soma = soma+v[i];
        }
        if (soma>15){
            System.out.println("A soma dos valores do vetor é de"+soma);
        }
        else
            System.out.println("A soma é menor que 10.");
    }
}
