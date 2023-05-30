package src;

public class NestedLoop {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        // x = 0
        while (x < 3) {
            System.out.println("x: " + x);

            // y = 0
            while (y< 3) {
                System.out.println("y: " + y);
                y++;
            }
            x++;
        }

    }
}
