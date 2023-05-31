import java.util.Scanner;

public class StdinStndout2 {

    /* Task: There're 3 lines of input:
    1. First line, an integer
    2. Second line, a double
    3. Third line, a string
    */

    public static void main(String[] args) {

        // declare class scan untuk input(scanner)
        Scanner scan = new Scanner(System.in);

        // declare variable to store integer, boolean and string

        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();                // untuk guna .nextLine(), declare dulu .nextLine() sebelum guna
        String c = scan.nextLine();     // untuk declare input untuk string. sebab dia akan tunggu input integer next
        scan.close();                   // kalau .next(), akan return first word sahaja!

        // call out the variable to output
        System.out.println("String: "+ c);
        System.out.println("Double: "+ b);
        System.out.println("Int: "+ a);

    }
}
