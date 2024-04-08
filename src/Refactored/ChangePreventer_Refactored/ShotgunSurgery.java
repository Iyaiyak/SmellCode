package Refactored.ChangePreventer_Refactored;

public class ShoutgunSurgeryRefactored {
    private int x;
    private int y;
    private int z;
    
    public ShoutgunSurgeryRefactored() {
        // constructor
    }
    
    public void doSomething(int a) {
        calculateX(a);
        calculateY(a);
        calculateZ(a);
    }
    
    private void calculateX(int a) {
        this.x = a + 1;
    }
    
    private void calculateY(int a) {
        this.y = a * 2;
    }
    
    private void calculateZ(int a) {
        this.z = a - 1;
    }
    
    public void doSomethingElse(int b) {
        modifyX(b);
        modifyY(b);
        modifyZ(b);
    }
    
    private void modifyX(int b) {
        this.x += b;
    }
    
    private void modifyY(int b) {
        this.y -= b;
    }
    
    private void modifyZ(int b) {
        this.z *= b;
    }
    
    public void anotherMethod() {
        increaseX();
        decreaseY();
    }
    
    private void increaseX() {
        this.x += 10;
    }
    
    private void decreaseY() {
        this.y -= 5;
    }public ShoutgunSurgeryRefactored() {
        // constructor
    }
    
    public void doSomething(int a) {
        calculateX(a);
        calculateY(a);
        calculateZ(a);
    }
    
    private void calculateX(int a) {
        this.x = a + 1;
    }
    
    private void calculateY(int a) {
        this.y = a * 2;
    }
    
    private void calculateZ(int a) {
        this.z = a - 1;
    }
    
    public void doSomethingElse(int b) {
        modifyX(b);
        modifyY(b);
        modifyZ(b);
    }
    
    private void modifyX(int b) {
        this.x += b;
    }
    
    private void modifyY(int b) {
        this.y -= b;
    }
    
    private void modifyZ(int b) {
        this.z *= b;
    }
    
    public void anotherMethod() {
        increaseX();
        decreaseY();
    }
    
    private void increaseX() {
        this.x += 10;
    }
    
    private void decreaseY() {
        this.y -= 5;
        }
    }

/*
 Dalam kode yang sudah direfaktorisasi, operasi-operasi yang berbeda telah dipisahkan ke dalam metode-metode yang terpisah 
 berdasarkan logika dan tanggung jawab masing-masing. Ini membuat kode menjadi lebih mudah dipahami, dipelihara, dan diperbaiki.
 */
