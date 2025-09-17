package observable;

import observer.Observer;
import observer.TestObserver;


import java.util.ArrayList;
import java.util.List;

public class TestObservable implements Observable<TestObservable> {

    private List<Observer<TestObservable>> observers = new ArrayList<>();
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public void addObserver(Observer<TestObservable> o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer<TestObservable> o) {
        observers.remove(o);
    }
}
