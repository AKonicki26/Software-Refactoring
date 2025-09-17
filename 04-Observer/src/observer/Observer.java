package observer;

import observable.Observable;

public interface Observer {
    public void update(Observable observable);
    public void display();
}
