package behavioral.observer;

import java.util.ArrayList;

public abstract class Observable {
    private final ArrayList<Observer> observers = new ArrayList<>(0);

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String content) {
        for (Observer observer : observers) {
            observer.update(content);
        }
    }
}
