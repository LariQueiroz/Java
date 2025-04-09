/******************************************************************************
 
 43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final. 

 *******************************************************************************/
 import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       double salario;
       double aumento;
       double imposto;
       
       System.out.print("Insira o salário do funcionário: ");
       salario = scanner.nextDouble();
       
       aumento = salario * 1.15;
       
       imposto = aumento * 0.8;
       
       System.out.println("salário inicial é de: "+salario+ " aumento salarial é de: "+aumento+ " tirando o imposto é: "+imposto);
    }
}