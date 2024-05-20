package inheritance;

import java.util.Scanner;

// Definisi kelas GeometricObject
class GeometricObject {
    private String color = "white";
    private boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Color: " + color + " and filled: " + filled;
    }
}

// Definisi kelas Segitiga yang memanjang GeometricObject
class Segitiga extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Segitiga() {
    }

    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}

// Program pengujian
public class Inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan sisi1 dari segitiga: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2 dari segitiga: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3 dari segitiga: ");
        double side3 = input.nextDouble();
        input.nextLine(); // Konsumsi newline

        System.out.print("Masukkan warna: ");
        String color = input.nextLine();

        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        // Menampilkan hasil
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
}
