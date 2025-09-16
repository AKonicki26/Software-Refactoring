package guitar;

public class GibsonFlyingV implements Guitar {

    @Override
    public void play() {
        System.out.println("Neeeeeoooooowwmmmmmm");
    }

    @Override
    public void display() {
        System.out.println("This is a rad Gibson Flying V");
    }

    @Override
    public String getName() {
        return "Gibson Flying V";
    }
}
