import java.util.Scanner;

public class JavaStdinStdnout {

    public static void main(String[] args) {

        // Define scanner class with name scan
        Scanner scan = new Scanner(System.in);

        // Prompt the user for integer input, a, b, and c
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Output the input from the user
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
