package observer;

import observable.Subject;

public interface Observer {
    public void update(Subject observable) throws UnsupportedOperationException;
}
