package structural.decorator;

public class PlainTextView implements TextView {
    @Override
    public void render(String text) {
        System.out.println(text);
    }
}
