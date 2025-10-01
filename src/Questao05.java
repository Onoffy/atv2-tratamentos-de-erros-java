import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String string = usuario.nextLine();

        if (string.isEmpty()) {
            string = null;
            System.out.println("Essa string é nula!");
        }
        try {
            System.out.println(string.length());
        } catch (NullPointerException e) {
            System.err.println("String nula!");
        }

    }
}
