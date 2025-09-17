package observer;

import observable.Observable;

public interface Observer<T extends Observable<T>> {
    public void update(T observable);
    public void display();
}
