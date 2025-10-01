public class Questao08 {
    public static void main(String[] args) {

        String[] mangas = {"Kagurabachi", "67", "Fire Punch", "JJK: Modulo", "10"};

        try {
            for (int i = 0; i < mangas.length; i++) {
                Integer.parseInt(mangas[i]);
            }
        } catch (NumberFormatException e) {
            System.err.println("Alguns itens não são decimais!");
        }

        System.out.println(mangas[1]);

    }
}
