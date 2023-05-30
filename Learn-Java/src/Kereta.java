package src;

public class Kereta {

    // Attributes
    private String jenama;
    private String jenis;

    // Constructor
    public Kereta() {
    }

    public String getJenama() {
        return jenama;
    }

    public void setJenama(String jenama) {
        if (this.jenama == null) {
            this.jenama = jenama;
        } else {
            System.out.println("KERETA INI SUDA ADA JENAMA");
        }
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
