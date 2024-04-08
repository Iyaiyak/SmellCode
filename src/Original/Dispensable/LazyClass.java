package Original.Dispensable;

public class Price {
	private int value;

	public Price(int value) throws Exception {
		if(!PriceValidator.validate(value)) {
			throw new Exception("price not valid");
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

public class PriceValidator {
	public static boolean validate(int value){
		return value >= 0;
	}
}

//Kode tersebut dapat dianggap sebagai lazy class smell karena kelas Price memiliki sedikit fungsi atau tanggung jawab yang diberikan, yaitu hanya untuk menyimpan nilai harga dan memberikan akses ke nilai tersebut melalui metode getValue(). Sebagai contoh, jika nantinya kelas ini tidak lagi memiliki tanggung jawab tambahan atau metode lain yang relevan, kelas ini menjadi "malas" atau "berlebihan" karena tidak memberikan nilai tambah yang signifikan.

