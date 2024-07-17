package behavioral_patterns.chain_of_responsability;

public interface Handler{
    public void nextHandler(Handler handler);
    public void workHandler(String request);
}