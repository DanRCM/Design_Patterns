package behavioral_patterns.chain_of_responsability;

public class ConcreteHandler implements Handler{
    private Handler next;

    @Override
    public void nextHandler(Handler handler) {
        this.next = handler;
    }

    @Override
    public void workHandler(String request) {
        if (request.equals("Request2")) {
            System.out.println("ConcreteHandler2 handled the request.");
        } else if (next != null) {
            next.workHandler(request);
        }
    }
    
}
