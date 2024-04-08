package Refactored.ChangePreventer_Refactored;

// Interface untuk produk elektronik
public interface ElectronicProduct {
    String getName();
    double getPrice();
}

// Implementasi Laptop
public class Laptop implements ElectronicProduct {
    private String name;
    private double price;
    private String processor;

    public Laptop(String name, double price, String processor) {
        this.name = name;
        this.price = price;
        this.processor = processor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }
}

// Implementasi Smartphone
public class Smartphone implements ElectronicProduct {
    private String name;
    private double price;
    private String screenSize;

    public Smartphone(String name, double price, String screenSize) {
        this.name = name;
        this.price = price;
        this.screenSize = screenSize;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getScreenSize() {
        return screenSize;
    }
}

// Interface untuk metode pembayaran
public interface PaymentMethod {
    String getPaymentMethod();
}

// Implementasi Pembayaran dengan Kartu Kredit
public class CreditCardPayment implements PaymentMethod {
    private String paymentMethod;
    private String cardType;

    public CreditCardPayment(String paymentMethod, String cardType) {
        this.paymentMethod = paymentMethod;
        this.cardType = cardType;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod + " - " + cardType;
    }
}

// Implementasi Pembayaran dengan PayPal
public class PayPalPayment implements PaymentMethod {
    private String paymentMethod;
    private String email;

    public PayPalPayment(String paymentMethod, String email) {
        this.paymentMethod = paymentMethod;
        this.email = email;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod + " - " + email;
    }
}

public class Main {
    public static void main(String[] args) {
        ElectronicProduct laptop = new Laptop("Laptop A", 1000.0, "Intel Core i7");
        ElectronicProduct smartphone = new Smartphone("Smartphone B", 500.0, "6 inches");

        PaymentMethod creditCardPayment = new CreditCardPayment("Credit Card", "Visa");
        PaymentMethod payPalPayment = new PayPalPayment("PayPal", "example@example.com");

        System.out.println("Product: " + laptop.getName() + ", Price: $" + laptop.getPrice());
        System.out.println("Product: " + smartphone.getName() + ", Price: $" + smartphone.getPrice());
        System.out.println("Payment Method: " + creditCardPayment.getPaymentMethod());
        System.out.println("Payment Method: " + payPalPayment.getPaymentMethod());
    }
}

/*Dalam contoh ini, kita telah memisahkan hierarki untuk produk elektronik (ElectronicProduct) 
dan metode pembayaran (PaymentMethod). Masing-masing kelas hanya bertanggung jawab atas satu hal, 
dan tidak ada ketergantungan langsung antara kedua hierarki kelas tersebut. Hal ini membuat kode menjadi lebih modular, 
mudah dipahami, dan memudahkan pengembangan di masa depan.*/

