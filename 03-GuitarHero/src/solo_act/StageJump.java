package solo_act;

public class StageJump implements SoloAct {

    @Override
    public void perform() {
        System.out.println("Stage Jump!! RAAAHHHHHHH");
    }

    @Override
    public String getName() {
        return "Stage Jump";
    }
}
