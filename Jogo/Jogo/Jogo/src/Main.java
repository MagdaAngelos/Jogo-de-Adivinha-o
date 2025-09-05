import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int palpite;
        int tentativa = 1;
        int numero = (int) (Math.random() * 10) + 1;
        {
            System.out.println("Jogo da adivinhação! \n adivinhe o numero e ganhe ");


            while (tentativa < 4) {
                System.out.println("Tentativa " + tentativa + " :");
                palpite = scanner.nextInt();

                if (palpite == numero) {
                    System.out.println("Parabens voce venceu");
                    break;
                } else if (palpite < numero) {
                    System.out.println("Dica: Tente um número maior!");
                } else {
                    System.out.println("Dica: Tente um número menor!");
                }
                tentativa++;

            }

            if (tentativa > 3) {
                System.out.println("Você perdeu o número era: " + numero);
            }
        }
    }
}
