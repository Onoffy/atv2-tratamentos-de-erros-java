import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = usuario.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = usuario.nextInt();

        try {
            int resultado = n1 / n2;
            System.out.println(resultado);
        } catch (ArithmeticException e){
            System.err.println("Não é possível dividir por 0");
        } catch (Exception e) {
            System.err.println("Erro");
        }



    }
}
