package Refactored.Dispensable_Refactored;

public class duplicateCode {
    public static void main(String[] args) {
        double sideLength = 5;
        
        ```
            // Menghitung luas dan keliling persegi
            double area = sideLength * sideLength;
            double perimeter = 4 * sideLength;
        
            System.out.println("Luas persegi: " + area);
            System.out.println("Keliling persegi: " + perimeter);
                } 
}
//Dengan cara ini, kita tidak lagi memerlukan class SquareCalculator karena perhitungan luas dan keliling persegi dilakukan langsung di dalam method main, menghilangkan smell code dispensable yang ada sebelumnya.