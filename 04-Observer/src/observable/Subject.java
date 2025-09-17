package observable;

import observer.Observer;

public interface Subject {
    public void notifyObservers();

    public void addObserver(Observer o);

    public void removeObserver(Observer o);
}
