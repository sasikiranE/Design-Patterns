package behavioral.observer;

public class LineCounter implements Observer {

    @Override
    public void update(String content) {
        System.out.println(String.format("LineCounter got notified with the new content : %s", content));
    }
}
