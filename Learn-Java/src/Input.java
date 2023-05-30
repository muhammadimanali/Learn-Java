package src;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Sila berikan nama: ");
        String nama = scan.next();
        System.out.println("Sila berikan nombor: ");
        int nombor = scan.nextInt();


        System.out.println("Selamat pagi " + nama);
        System.out.println("Nombor yang diberikan: " + nombor);

    }
}
