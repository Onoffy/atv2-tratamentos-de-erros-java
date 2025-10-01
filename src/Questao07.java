import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Escolha a operação (+ - / *): ");
        String operacao = usuario.nextLine();

        System.out.print("Digite o primeiro número: ");
        int n1 = usuario.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = usuario.nextInt();

        switch (operacao) {
            case "+" -> System.out.printf("Resultado: %d", n1 + n2);
            case "-" -> System.out.printf("Resultado: %d", n1 - n2);
            case "/" -> System.out.printf("Resultado: %d", n1 / n2);
            case "*" -> System.out.printf("Resultado: %d", n1 * n2);
            default -> System.out.println("Operação inválida!");
        }

    }
}
