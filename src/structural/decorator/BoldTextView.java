package structural.decorator;

public class BoldTextView implements TextView {

    private final TextView textView;

    public BoldTextView(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void render(String text) {
        textView.render("<b>" + text + "</b>");
    }
}
