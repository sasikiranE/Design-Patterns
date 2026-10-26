package structural.decorator;

public class ItalicTextView implements TextView {

    private final TextView textView;

    public ItalicTextView(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void render(String text) {
        this.textView.render("<i>" + text + "</i>");
    }
}
