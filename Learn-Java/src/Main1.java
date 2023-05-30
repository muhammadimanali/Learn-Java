package src;

public class Main1 {

    public static void main(String[] args) {

        Kereta kereta1 = new Kereta();

        // Tetapkan attribut dengan Setter

        kereta1.setJenama("Honda");
        kereta1.setJenis("Civic");

        // Dapatkan attribut dengan Getter

        System.out.println(kereta1.getJenama());
        System.out.println(kereta1.getJenis());

        kereta1.setJenama("Proton");
        System.out.println(kereta1.getJenama());
    }
}
