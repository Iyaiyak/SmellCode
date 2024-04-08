package Refactored.Dispensable_Refactored;

public class Comments {
	private int value1;
    private String value2;

    public Comments(int value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int calculateSum() {
        return value1 + Integer.parseInt(value2);
    }
}


/*Dalam hasil refactoring ini, kita menghapus semua komentar yang tidak relevan atau tidak memberikan informasi yang berguna. 
Metode calculateSum tetap ada karena memberikan fungsionalitas yang jelas dan berguna dalam kelas ini. 
Dengan demikian, kita memperbaiki "smell code" terkait dengan komentar yang tidak perlu dalam kelas ini.
*/
