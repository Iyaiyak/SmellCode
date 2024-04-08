package Original.ChangePreventer;

public class ShoutgunSurgery {
    private int x;
    private int y;
    private int z;
    
    public ShoutgunSurgery() {
        // constructor
    }
    
    // Method 1
    public void doSomething(int a) {
        // Shoutgun Surgery: multiple unrelated operations in one method
        this.x = a + 1;
        this.y = a * 2;
        this.z = a - 1;
    
        // Some other unrelated code
        if (a > 10) {
            // do something
        } else {
            // do something else
        }
    }
    
    // Method 2
    public void doSomethingElse(int b) {
        // Shoutgun Surgery: modifying multiple unrelated fields in one method
        this.x += b;
        this.y -= b;
        this.z *= b;
    
        // Some other unrelated code
        for (int i = 0; i < b; i++) {
            // do something repeatedly
        }
    }
    
    // Method 3
    public void anotherMethod() {
        // Shoutgun Surgery: scattered changes across multiple methods
        this.x += 10;
    
        // Some other unrelated code
        for (int i = 0; i < 5; i++) {
            // do something repeatedly
        }
    
        this.y -= 5;
        }
    }

/*
Dalam contoh di atas, terdapat beberapa karakteristik "smell code" yang dapat menghambat perubahan kode dengan mudah:

1. **Shoutgun Surgery**: Operasi-operasi yang tidak terkait secara logis dikelompokkan dalam satu metode, seperti pada **`doSomething`** dan **`doSomethingElse`**.
2. **Modifikasi Multiple Unrelated Fields**: Modifikasi beberapa variabel yang tidak terkait dalam satu metode, seperti pada **`doSomethingElse`**.
3. **Scattered Changes**: Perubahan tersebar di beberapa metode yang tidak terkait, seperti pada **`anotherMethod`**.
*/