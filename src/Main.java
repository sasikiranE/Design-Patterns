import structural.decorator.BoldTextView;
import structural.decorator.ItalicTextView;
import structural.decorator.PlainTextView;
import structural.decorator.TextView;

public class Main {
    public static void main(String[] args) {
        TextView tv = new ItalicTextView(new BoldTextView(new PlainTextView()));
        tv.render("Sasi Kiran");
    }
}