package Refactored.ChangePreventer_Refactored;

import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;

    public Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Getter dan setter
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

public class InvoiceGenerator {
    public void generateInvoice(Order order) {
        // Generate invoice untuk pesanan
        System.out.println("Generating invoice for order ID: " + order.getOrderId());
    }
}

public class NotificationSender {
    public void sendNotification(Order order) {
        // Kirim notifikasi terkait pesanan
        System.out.println("Sending notification for order ID: " + order.getOrderId());
    }
}

public class InventoryUpdater {
    public void updateInventory(Order order) {
        // Update stok inventaris setelah pesanan diproses
        System.out.println("Updating inventory for order ID: " + order.getOrderId());
    }
}

public class ProfitCalculator {
    public double calculateProfit(List<Order> orders) {
        double totalProfit = 0;
        for (Order order : orders) {
            // Hitung keuntungan dari pesanan yang diproses
            double profit = order.getTotalAmount() * 0.1; // Misalnya, 10% keuntungan
            totalProfit += profit;
        }
        return totalProfit;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "John Doe", 100.0),
                new Order(2, "Jane Smith", 150.0)
        );

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        NotificationSender notificationSender = new NotificationSender();
        InventoryUpdater inventoryUpdater = new InventoryUpdater();
        ProfitCalculator profitCalculator = new ProfitCalculator();

        for (Order order : orders) {
            invoiceGenerator.generateInvoice(order);
            notificationSender.sendNotification(order);
            inventoryUpdater.updateInventory(order);
        }

        double totalProfit = profitCalculator.calculateProfit(orders);
        System.out.println("Total profit: $" + totalProfit);
    }
}

//Dalam refaktorisasi ini, kita telah memecah tanggung jawab OrderProcessor ke dalam kelas-kelas terpisah yang lebih spesifik: InvoiceGenerator untuk menghasilkan invoice, NotificationSender untuk mengirim notifikasi, InventoryUpdater untuk memperbarui inventaris, dan ProfitCalculator untuk menghitung keuntungan. Hal ini membuat setiap kelas hanya bertanggung jawab atas satu tugas, sesuai dengan prinsip SRP, dan memudahkan pemeliharaan serta pengembangan kode di masa depan.