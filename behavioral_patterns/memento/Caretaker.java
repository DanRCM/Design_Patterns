package behavioral_patterns.memento;

import java.util.Stack;

public class Caretaker {
        private Stack<Memento> mementoStack = new Stack<>();

    public void save(TextEditor textEditor) {
        mementoStack.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!mementoStack.isEmpty()) {
            textEditor.restore(mementoStack.pop());
        } else {
            System.out.println("No states to restore.");
        }
    }
}
