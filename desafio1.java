/******************************************************************************
  
1- Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.
  
  *******************************************************************************/
  import java.util.Scanner;

public class desafio1 {

    public static void main(String[] args) {
        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        Scanner scanner = new Scanner(System.in);
        int voto;

       
        while (true) {
            System.out.println("Digite o número do candidato (1, 2, 3) ou 0 para encerrar a votação:");
            voto = scanner.nextInt();

            if (voto == 0) {
                break; 
            }

            
            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Voto inválido! Digite 1, 2 ou 3.");
            }
        }

       
        System.out.println("\nResultado da votação:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        
        int maxVotos = Math.max(votosCandidato1, Math.max(votosCandidato2, votosCandidato3));

        if (votosCandidato1 == votosCandidato2 && votosCandidato2 == votosCandidato3) {
            System.out.println("Empate entre os três candidatos!");
        } else if (votosCandidato1 == maxVotos && votosCandidato2 == maxVotos) {
            System.out.println("Empate entre o Candidato 1 e o Candidato 2!");
        } else if (votosCandidato1 == maxVotos && votosCandidato3 == maxVotos) {
            System.out.println("Empate entre o Candidato 1 e o Candidato 3!");
        } else if (votosCandidato2 == maxVotos && votosCandidato3 == maxVotos) {
            System.out.println("Empate entre o Candidato 2 e o Candidato 3!");
        } else if (votosCandidato1 == maxVotos) {
            System.out.println("O vencedor é o Candidato 1!");
        } else if (votosCandidato2 == maxVotos) {
            System.out.println("O vencedor é o Candidato 2!");
        } else {
            System.out.println("O vencedor é o Candidato 3!");
        }

    }
}
    