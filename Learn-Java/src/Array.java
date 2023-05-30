package src;

public class Array {

    public static void main(String[] args) {

        int[] myArray = {5, 10, 11, 3}; // length array = 4
        int[] emptyArray = new int[5]; // length array = 5 {0,0,0,0,0}

        // untuk access array, guna index, start dengan 0
        int x = myArray[0]; // access array untuk myArray untuk index 0, which is 5.

        // untuk assign array dekat empty array,
        emptyArray[0] = 10; // assign nombor 10 kepada emptyArray untuk index 0
        int y = emptyArray[0];

        // untuk print array yang ada
        for (int i = 0; i< myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println(y);
    }
}


