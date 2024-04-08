package Refactored.Dispensable_Refactored;


public class Price {
	private int value;
	
	public Price(int value) throws Exception {
		if(!isPriceValid(value)) {
			throw new Exception("price not valid");
		}
		
		this.value = value;
	}

	private boolean isPriceValid(int value){
		return value >= 0;
	}
	
	public int getValue() {
		return value;
	}
}
/*
1.**Validasi Harga Terpisah**: Dalam kode refactor, validasi harga (**`isPriceValid(int value)`**) dipisahkan ke dalam metode tersendiri. Ini membuat kode menjadi lebih terorganisir dan mudah dipahami karena setiap tanggung jawab (validasi dan penyimpanan nilai) ditempatkan di metode yang terpisah.
2. **Kehandalan dan Pembacaan Kode yang Lebih Baik**: Dengan adanya validasi yang dipisahkan, kode menjadi lebih handal karena validasi dapat diakses dan digunakan kembali dari mana saja dalam kelas **`Price`** atau bahkan dari kelas lain jika diperlukan. Selain itu, pemeliharaan kode juga menjadi lebih mudah karena logika validasi terpisah dan jelas.
3. **Pesan Pengecualian yang Lebih Deskriptif**: Pesan pengecualian "price not valid" yang diberikan dalam pengecualian lebih deskriptif daripada menggunakan **`Exception`** tanpa keterangan tambahan. Ini membantu pengembang memahami penyebab pengecualian dengan lebih baik saat terjadi kesalahan validasi.
 */

