/******************************************************************************
 Construa um algoritmo que determine
quanto será gasto para encher o tanque de um carro (VG), sabendo-se que o preço
da gasolina é de R$ 1,80 e o preço do álcool é de R$ 1,00. O usuário fornecerá
os seguintes dados: Tipo de carro (TC) (G – gasolina ou A – álcool) e
Capacidade do tanque (CT), em litros

*******************************************************************************/
import java.util.Scanner; 
public class ex10
{
     public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o tipo de combustível (G para gasolina, A para álcool): ");
        char tipoCarro = scanner.next().charAt(0);

        
        System.out.print("Digite a capacidade do tanque (em litros): ");
        double capacidadeTanque = scanner.nextDouble();

      
        double precoGasolina = 1.80;
        double precoAlcool = 1.00;
        double valorGasto = 0;

      
        if (tipoCarro == 'G' || tipoCarro == 'g') {
            valorGasto = capacidadeTanque * precoGasolina;  
        } else if (tipoCarro == 'A' || tipoCarro == 'a') {
            valorGasto = capacidadeTanque * precoAlcool;  
        } else {
            System.out.println("Tipo de combustível inválido! Use 'G' para gasolina ou 'A' para álcool.");
            scanner.close();
            return; 
        }
       
        System.out.printf("O valor a ser gasto para encher o tanque é: R$ %.2f\n", valorGasto);
        scanner.close();
    }
}