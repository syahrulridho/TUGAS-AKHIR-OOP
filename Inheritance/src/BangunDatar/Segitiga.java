package Inheritance;

public class Segitiga extends BangunDatar {
    
    float alas;
    float tinggi;

    float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
    float keliling(){
        float kliling = alas + alas + alas;
        System.out.println("Keliling Segitiga: " + kliling);
        return kliling;
}
}