package src;

public class ComparisonAndLogical {

    public static void main(String[] args) {

//        == , !=, >=, <=, >, <

//      hanya boleh guna untuk primitive variables

        boolean bool1 = 'b' > 1; // banding guna ASCII value

//      compare between string
//      string is reference type

        boolean bool2 = "Hello".equals("Helo");

        System.out.println(bool2);
    }
}

