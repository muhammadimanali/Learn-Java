package src;

public class Burung extends Haiwan{

    double berat;

    public Burung(String nama, double berat) {
        super(nama); // panggil constructor of parents class(Haiwan)
        this.berat = berat;
    }

    public void terbang() {
        System.out.println(this.nama+ " sedang terbang");
    }

    public void makan() {
        System.out.println(this.nama+ " sedang mamam");
        // child method telah overwrite parents punya method
    }
}
