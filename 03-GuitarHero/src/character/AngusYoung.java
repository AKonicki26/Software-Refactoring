package character;

import guitar.GibsonFlyingV;
import guitar.Guitar;
import solo_act.StageJump;

public class AngusYoung extends GameCharacter {

    public AngusYoung() {
        this.name = "Angus Young";
        this.guitar = new GibsonFlyingV();
        this.solo = new StageJump();
    }
}
