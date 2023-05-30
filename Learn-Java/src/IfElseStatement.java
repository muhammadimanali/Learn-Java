package src;

public class IfElseStatement {
    public static void main(String[] args) {
/*
        if (condition) {
            run this block;
        }
        else {
            run this block
        }
*/

        char jantina = 'p';

        if (jantina == 'l') {
            System.out.println("Masuk tandas lelaki");
        } else if (jantina == 'p') {
            System.out.println("Masuk tandas perempuan");
        } else {
            System.out.println("Jantina tidak dikenalpasti");
        }

    }
}
