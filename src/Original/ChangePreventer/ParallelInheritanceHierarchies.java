package Original.ChangePreventer;

// Hierarchy untuk produk elektronik
public class ElectronicProduct {
    private String name;
    private double price;

    public ElectronicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Laptop extends ElectronicProduct {
    private String processor;

    public Laptop(String name, double price, String processor) {
        super(name, price);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }
}

public class Smartphone extends ElectronicProduct {
    private String screenSize;

    public Smartphone(String name, double price, String screenSize) {
        super(name, price);
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }
}

// Hierarchy untuk pembayaran
public class Payment {
    private String paymentMethod;

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}

public class CreditCardPayment extends Payment {
    private String cardType;

    public CreditCardPayment(String paymentMethod, String cardType) {
        super(paymentMethod);
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }
}

public class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(String paymentMethod, String email) {
        super(paymentMethod);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

/*Dalam contoh ini, terdapat dua hierarki kelas yang berjalan secara sejajar: hierarki untuk produk elektronik 
(ElectronicProduct, Laptop, Smartphone) dan hierarki untuk pembayaran (Payment, CreditCardPayment, PayPalPayment). 
Jika terjadi perubahan pada hierarki salah satu kelas (misalnya, tambah metode pembayaran baru), maka hal ini dapat 
memengaruhi kelas-kelas pada hierarki lainnya.

Untuk mengatasi Parallel Inheritance Hierarchies, solusinya adalah dengan mencari cara untuk merancang kelas-kelas agar 
lebih modular dan tidak saling terkait secara langsung. Salah satu pendekatan yang dapat digunakan adalah dengan menggunakan 
pola desain seperti Strategy Pattern untuk mengisolasi perubahan dan menghindari ketergantungan langsung antar hierarki kelas.*/
