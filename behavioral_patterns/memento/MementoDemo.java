package behavioral_patterns.memento;

public class MementoDemo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setContent("Version 1");
        caretaker.save(textEditor);
        
        textEditor.setContent("Version 2");
        caretaker.save(textEditor);

        textEditor.setContent("Version 3");

        caretaker.undo(textEditor);  // Restores to "Version 2"
        caretaker.undo(textEditor);  // Restores to "Version 1"
        caretaker.undo(textEditor);  // No states to restore
    }
}