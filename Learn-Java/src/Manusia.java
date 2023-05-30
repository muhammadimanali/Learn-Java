package src;

public class Manusia {

    // attributes
    String nama;
    int umur;

    // constructor
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // methods
    public void makan() {

        System.out.println(this.nama +" sedang makan");
    }

    public static void main(String[] args) {

        Manusia manusia1 = new Manusia("Iman", 24);
        Manusia manusia2 = new Manusia("Iman Ali", 20);
        Manusia manusia3 = new Manusia("Jamaludin",20);

        System.out.println(manusia1.umur);
        System.out.println(manusia2.umur);
        System.out.println(manusia3.umur);
    }
}
