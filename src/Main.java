import behavioral.observer.LineCounter;
import behavioral.observer.TextEditor;


public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("text content");
        textEditor.addObserver(new LineCounter());
        textEditor.setContent("This is the observer pattern");
    }
}