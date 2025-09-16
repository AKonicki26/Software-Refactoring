package guitar;

public class FenderTelecaster implements Guitar {

    @Override
    public void play() {
        System.out.println("Meow meowwwww, meow meowmeow meowwwwww");
    }

    @Override
    public void display() {
        System.out.println("This is a legendary Fender Telecaster");
    }

    @Override
    public String getName() {
        return "Fender Telecaster";
    }
}
