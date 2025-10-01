import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        int[] listaNumeros = {1, 2, 3, 4, 5};

        Scanner usuario = new Scanner(System.in);

        System.out.print("Digite o índice: ");
        int indice = usuario.nextInt();

        try{
            int indicePego = listaNumeros[indice];

            System.out.println(indicePego);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Essa posição não existe!");
        }


    }
}
