import java.util.Scanner;

public class forca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String PalavraSecreta, NomeJogador2;
        char letra;

        System.out.println("JOGADOR 1 - Digite a palavra secreta que será adivinhada: ");
        PalavraSecreta = ler.nextLine().toLowerCase();
        char[] palavraSecreta = PalavraSecreta.toCharArray();  

        char[] palavraOculta = new char[palavraSecreta.length];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }
        System.out.print("Jogador 2, digite seu nome: ");
        NomeJogador2 = ler.nextLine();

        int tentativasRestantes = 5;
        int letrasCorretas = 0;

        while (tentativasRestantes > 0 && letrasCorretas < palavraSecreta.length) {
        System.out.print("\nPalavra: ");
        for (char letraOculta : palavraOculta) {
        System.out.print(letraOculta + " ");
        }

        System.out.println("\nTentativas restantes: " + tentativasRestantes);
        System.out.print("Digite uma letra: ");
        letra = ler.nextLine().toLowerCase().charAt(0);

        boolean acertou = false;

        for (int i = 0; i < palavraSecreta.length; i++) {
        if (palavraSecreta[i] == letra && palavraOculta[i] == '_') {
        palavraOculta[i] = letra;
        letrasCorretas++;
        acertou = true;
        }
    }

        if (!acertou) {
        tentativasRestantes--;
        desenharForca(5 - tentativasRestantes);
        }

        if (letrasCorretas == palavraSecreta.length) {
        System.out.println("\nParabéns " + NomeJogador2 + "! Você ganhou!");
        break;
        }
    }

        if (letrasCorretas != palavraSecreta.length) {
        System.out.println("\n" + NomeJogador2 + ", você errou!");
        System.out.print("A palavra secreta era: ");
        System.out.println(PalavraSecreta);
        desenharForca(5);  
        }

        ler.close();  
    }

    public static void desenharForca(int tentativas) {
        if (tentativas == 1) {
        System.out.println("                _____");
        System.out.println("                |   |");
        System.out.println("                |   O");
        System.out.println("                |   ");
        System.out.println("                |   ");
        System.out.println("                |   ");
        System.out.println("              __|__ ");
        } else if (tentativas == 2) {
        System.out.println("                _____");
        System.out.println("                |   |");
        System.out.println("                |   O");
        System.out.println("                |   |");
        System.out.println("                |   ");
        System.out.println("                |   ");
        System.out.println("              __|__ ");
        } else if (tentativas == 3) {
        System.out.println("                _____");
        System.out.println("                |   |");
        System.out.println("                |   O");
        System.out.println("                |  /|");
        System.out.println("                |   ");
        System.out.println("                |   ");
        System.out.println("              __|__ ");
        } else if (tentativas == 4) {
        System.out.println("                _____");
        System.out.println("                |   |");
        System.out.println("                |   O");
        System.out.println("                |  /|\\");
        System.out.println("                |   ");
        System.out.println("                |   ");
        System.out.println("              __|__ ");
        } else if (tentativas == 5) {
        System.out.println("                _____");
        System.out.println("                |   |");
        System.out.println("                | (ツ)");
        System.out.println("                |  -|-");
        System.out.println("                |  /'\\");
        System.out.println("                |   ");
        System.out.println("              __|__ ");
        System.out.println("!! GAME OVER !!");
        }
    }
}
