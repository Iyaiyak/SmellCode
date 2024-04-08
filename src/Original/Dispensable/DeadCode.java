package Original.Dispensable;

public class DeadCode {
    private int status;

    public DeadCodeRealExample(int status) {
        this.status = status;
    }

    // Metode yang tidak pernah dipanggil
    private void unusedMethod() {
        System.out.println("This method is never called.");
    }

    // Metode yang memiliki kondisi yang selalu salah sehingga tidak pernah dieksekusi
    public void checkStatus() {
        if (status == 1) {
            System.out.println("Status is active.");
        } else if (status == 2) {
            System.out.println("Status is inactive.");
        } else {
            System.out.println("Invalid status.");
        }
    }

    // Metode yang dulunya digunakan, tetapi sekarang tidak lagi digunakan
    private void legacyMethod() {
        System.out.println("This method is part of legacy code.");
    }

}
/*
1. Metode **`unusedMethod`** tidak pernah dipanggil oleh kelas lain atau di dalam kelas sendiri, sehingga menjadi kode mati (dead code).
2. Metode **`checkStatus`** memiliki kondisi yang melibatkan **`status`** yang hanya memiliki dua kemungkinan nilai, namun dalam implementasi saat ini, hanya salah satu kondisi yang digunakan. Kondisi yang tidak pernah dieksekusi merupakan contoh kode mati (dead code).
3. Metode **`legacyMethod`** dulunya digunakan, tetapi sekarang tidak lagi dipanggil oleh kelas lain atau di dalam kelas sendiri, sehingga juga menjadi kode mati (dead code).

Kode mati seperti ini bisa menjadi beban dalam pemeliharaan kode, karena mengakibatkan pemborosan sumber daya dan mempersulit pemahaman terhadap kode yang sebenarnya digunakan. Sebaiknya kode mati seperti ini dihapus agar kode menjadi lebih bersih dan efisien.
 */
