import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String string = usuario.nextLine();

        try {
            System.out.printf("O que você digitou em inteiro: %d", Integer.parseInt(string));
        } catch (NumberFormatException e) {
            System.err.println("Erro!");
        }

    }
}