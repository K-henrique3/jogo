package adivinhe;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int pontuacao = 0;
        String continuar;

        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        do {
            int adivinhe = rd.nextInt(10) + 1; // Número entre 1 e 10
            int tentativas = 0;
            boolean acertou = false;

            System.out.println("Bem-vindo ao mini-jogo de adivinhação, " + nome);
            System.out.println("Você terá 3 tentativas.");
            System.out.println("Digite um número de 1 a 10:");

            while (!acertou && tentativas < 3) {
                int palpite = sc.nextInt();
                if (palpite >= 1 && palpite <= 10) {
                    tentativas++;
                    if (palpite != adivinhe) {
                        System.out.println("Você errou x_x");
                        System.out.println("Tentativas restantes: " + (3 - tentativas));
                    } else {
                        System.out.println("PARABÉNS " + nome + ", Você acertou!");
                        pontuacao++;
                        acertou = true;
                    }
                } else {
                    System.out.println("Digite um número válido.");
                }
            }

            if (tentativas >= 3) {
                System.out.println("O número correto era " + adivinhe);
            }

            System.out.print("Deseja jogar novamente? (sim/nao): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Sua pontuação final: " + pontuacao);
        System.out.println("Fim do jogo.");
        sc.close();
    }
}



