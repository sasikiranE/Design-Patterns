package behavioral.observer;

// publisher
public class TextEditor extends Observable {
    private String content;

    public TextEditor(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyObservers(this.content);
    }
}
