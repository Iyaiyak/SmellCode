package Refactored.Dispensable_Refactoredle_Refactored;

public class DeadCode {
    private int status;

    public DeadCode(int status) {
        this.status = status;
    }

    // Metode untuk memeriksa status dan memberikan pesan yang sesuai
    public void checkStatus() {
        if (status == 1) {
            System.out.println("Status is active.");
        } else if (status == 2) {
            System.out.println("Status is inactive.");
        } else {
            System.out.println("Invalid status.");
        }
    }
}
// Dalam hasil refaktor ini, kita telah menghapus metode unusedMethod dan legacyMethod yang tidak digunakan, sehingga menghilangkan kode mati (dead code). Metode checkStatus yang dipertahankan sekarang lebih fokus pada tugasnya yang sesungguhnya, yaitu memeriksa status dan memberikan pesan yang sesuai berdasarkan status tersebut. Dengan demikian, kita telah membersihkan dan menyederhanakan kode sehingga lebih mudah dipahami dan dipelihara.
