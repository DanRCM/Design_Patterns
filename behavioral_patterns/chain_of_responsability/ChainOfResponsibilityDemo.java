package behavioral_patterns.chain_of_responsability;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler2();

        handler1.nextHandler(handler2);

        handler1.workHandler("Request2");
        handler1.workHandler("Request2");
    }
}