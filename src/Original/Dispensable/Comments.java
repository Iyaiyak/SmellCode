package Original.Dispensable;

public class Comments {
    // Private fields to hold values
    private int value1;
    private String value2;

    /**
     * Constructor to initialize the values.
     *  value1 The first integer value.
     *  value2 The second string value.
     */
    public Comments(int value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * Method to calculate the sum of value1 and the integer value of value2.
     * The sum of value1 and value2 as an integer.
     */
    public int calculateSum() {
        return value1 + Integer.parseInt(value2);
    }
}
//Dalam contoh ini, Comments adalah kelas yang menunjukkan "smell code" yang berkaitan dengan komentar, 
//seperti komentar yang terlalu panjang tanpa memberikan nilai tambah yang signifikan.
