package structural.decorator;

public class UnderlineTextView implements   TextView {

    private final TextView textView;

    public UnderlineTextView(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void render(String text) {
        this.textView.render("<u>" + text + "</u>");
    }
}
