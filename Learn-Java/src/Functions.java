package src;

public class Functions {

    public static void main(String[] args) {

        // called function of addition with addition(int a, int b)
        int ans1 = addition(3,4);
        addition(5,6);
        addition(9,8);

        System.out.println(ans1);
    }

    public static int addition(int a, int b) {
        // block of code
        int ans = a + b;
        return ans;
    }
}
