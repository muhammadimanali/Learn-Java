package src.Package1;

public class Class1 {


    // untuk public, semua class boleh guna
    // untuk private, hanya class sendiri sahaja boleh guna,
    // cthnya: private di class1, hanya class1 shj yang boleh guna
    // untuk default, hanya boleh guna pada package yang sama.
    // cthnya: default pada class1, boleh digunakan pada class1, and class2.
    // untuk protected, boleh guna kalau class tu extends
    protected String nama = "Iman";

    protected void hello() {
        System.out.println("Hello!");
    }
}
