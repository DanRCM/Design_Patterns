package behavioral_patterns.strategy;
import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<String> items;
    private double totalAmount;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalAmount += price;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        paymentStrategy.pay(totalAmount);
    }
}