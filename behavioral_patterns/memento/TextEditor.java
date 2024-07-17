package behavioral_patterns.memento;

public class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
        System.out.println("Content set to: " + content);
    }

    public String getContent() {
        return content;
    }

    public Memento save() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        content = memento.getState();
        System.out.println("Content restored to: " + content);
    }
}
