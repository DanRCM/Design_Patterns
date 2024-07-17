package behavioral_patterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1200.00);
        cart.addItem("Mouse", 25.00);

        // Pago con tarjeta de crédito
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23"));
        cart.checkout();  // Output: Paid 1225.0 using Credit Card.

        // Pago con PayPal
        cart.setPaymentStrategy(new PayPalPayment("john@example.com", "password123"));
        cart.checkout();  // Output: Paid 1225.0 using PayPal.

        // Pago con criptomonedas
        cart.setPaymentStrategy(new CryptoPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout();  // Output: Paid 1225.0 using Cryptocurrency.
    }
}