package Original.ChangePreventer;

pimport java.util.ArrayList;
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

public class OrderProcessor {
    private List<Order> orders;

    public OrderProcessor(List<Order> orders) {
        this.orders = orders;
    }

    public void processOrders() {
        for (Order order : orders) {
            // Proses pesanan
            System.out.println("Processing order ID: " + order.getOrderId());
        }
    }

    public void displayOrders() {
        for (Order order : orders) {
            // Tampilkan detail pesanan
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer Name: " + order.getCustomerName());
            System.out.println("Total Amount: $" + order.getTotalAmount());
        }
    }

    public void generateInvoice() {
        for (Order order : orders) {
            // Generate invoice untuk pesanan
            System.out.println("Generating invoice for order ID: " + order.getOrderId());
        }
    }

    public void sendNotification() {
        for (Order order : orders) {
            // Kirim notifikasi terkait pesanan
            System.out.println("Sending notification for order ID: " + order.getOrderId());
        }
    }

    public void updateInventory() {
        for (Order order : orders) {
            // Update stok inventaris setelah pesanan diproses
            System.out.println("Updating inventory for order ID: " + order.getOrderId());
        }
    }

    public void calculateProfit() {
        double totalProfit = 0;
        for (Order order : orders) {
            // Hitung keuntungan dari pesanan yang diproses
            double profit = order.getTotalAmount() * 0.1; // Misalnya, 10% keuntungan
            totalProfit += profit;
        }
        System.out.println("Total profit: $" + totalProfit);
    }

    // Metode lain terkait manajemen pesanan, penjadwalan, dll.
}

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "John Doe", 100.0));
        orders.add(new Order(2, "Jane Smith", 150.0));
        
        OrderProcessor processor = new OrderProcessor(orders);
        processor.processOrders();
        processor.displayOrders();
        processor.generateInvoice();
        processor.sendNotification();
        processor.updateInventory();
        processor.calculateProfit();
    }
}

// Dalam contoh ini, OrderProcessor memiliki tanggung jawab yang terlalu banyak, termasuk memproses pesanan, menampilkan pesanan, menghasilkan invoice, mengirim notifikasi, memperbarui inventaris, dan menghitung keuntungan. Hal ini mengakibatkan kelas OrderProcessor menjadi tidak terfokus dan sulit untuk dipelihara jika terjadi perubahan terkait manajemen pesanan, keuangan, atau inventaris. Oleh karena itu, contoh ini mengilustrasikan "smell code" Change Preventer - Divergent Change.

