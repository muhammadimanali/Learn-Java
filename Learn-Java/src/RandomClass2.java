package src;

public class RandomClass2 {

    public static void main(String[] args) {

        // call non-static
        // create a new object, before calling the class/function
        RandomClass random = new RandomClass();
        System.out.println(random.nama);

        // call static class
        System.out.println(RandomClass.nama1);

    }
}
