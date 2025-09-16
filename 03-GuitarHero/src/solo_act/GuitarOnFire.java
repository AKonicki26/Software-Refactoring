package solo_act;

public class GuitarOnFire implements SoloAct {

    @Override
    public void perform() {
        System.out.println("Woah the guitar is on fire now");
    }

    @Override
    public String getName() {
        return "On Fire Guitar";
    }
}
