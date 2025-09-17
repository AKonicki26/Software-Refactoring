package observer;

import javax.security.auth.Subject;

public class UnexpectedSubjectObservedException extends RuntimeException {
    public UnexpectedSubjectObservedException() {super("Unexpected Subject observed by observer");}
    public UnexpectedSubjectObservedException(Subject subjct) {super("Unexpected Subject observed by observer: " + subjct.getClass() );}
    public UnexpectedSubjectObservedException(String message) {
        super(message);
    }
}
