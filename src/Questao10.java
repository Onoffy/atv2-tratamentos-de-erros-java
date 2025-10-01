import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número, caso queira sair, digite SAIR: ");

        while (true) {
            System.out.print("- ");
            String input = usuario.nextLine();

            if (input.toLowerCase().equals("sair")) {
                break;
            }

            try{
                numero = Integer.parseInt(input);
            } catch (Exception e) {
                System.err.println("Entrada inválida!");
            }
        }


    }
}
