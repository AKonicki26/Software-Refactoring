package guitar;

public class GibsonSG implements Guitar {

    @Override
    public void play() {
        System.out.println("Bow bow baw bow");
    }

    @Override
    public void display() {
        System.out.println("This is a cool Gibson SG");
    }

    @Override
    public String getName() {
        return "GibsonSG";
    }
}
