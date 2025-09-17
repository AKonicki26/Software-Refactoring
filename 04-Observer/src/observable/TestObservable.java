package observable;

import observer.Observer;
import observer.TestObserver;


import java.util.ArrayList;
import java.util.List;

public class TestObservable implements Observable {

    private List<Observer> observers = new ArrayList<>();
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
