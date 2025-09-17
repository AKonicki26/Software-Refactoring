package observable;

import observer.Observer;

public interface Observable<T extends Observable<T>> {
    public void notifyObservers();

    public void addObserver(Observer<T> o);

    public void removeObserver(Observer<T> o);
}
