import java.util.Scanner;

public class IfElseStatement {

    // Task
    /* Given an integer ,N , perform the following conditional actions:
        If N is odd, print Weird
        If N is even and in the inclusive range of 2 to 5, print Not Weird
        If N is even and in the inclusive range of 6 to 20, print Weird
        If N is even and greater than , print Not Weird
    Complete the stub code provided in your editor to print whether or not N is weird.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N %2 == 1 ) {
            System.out.println("Weird");
        } if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >=6 && N <=20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
