package Original.Dispensable;
// Contoh Smell Code Dispensable Class
class SquareCalculator {
    private double sideLength;

    public SquareCalculator(double sideLength) {
        this.sideLength = sideLength;
    }
    public double calculateArea() {
        return sideLength * sideLength;
    }
    // Method untuk menghitung keliling persegi
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
public class duplicateCode {
    public static void main(String[] args) {
        SquareCalculator squareCalc = new SquareCalculator(5);

        // Menghitung luas dan keliling persegi
        double area = squareCalc.calculateArea();
        double perimeter = squareCalc.calculatePerimeter();

        System.out.println("Luas persegi: " + area);
        System.out.println("Keliling persegi: " + perimeter);
    } 
}
// Smell code dispensable dalam contoh tersebut adalah jenis Duplicate Code, di mana fungsi-fungsi yang ada dalam SquareCalculator dapat dengan mudah digantikan dengan perhitungan langsung dalam bagian kode yang memanggilnya. Hal ini membuat class SquareCalculator menjadi dispensable karena tidak memberikan nilai tambah yang signifikan dibandingkan dengan melakukan perhitungan langsung di tempat yang diperlukan.


