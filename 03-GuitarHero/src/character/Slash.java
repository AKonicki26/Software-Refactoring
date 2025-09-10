package character;

import guitar.FenderTelecaster;
import solo_act.GuitarOnFire;

public class Slash extends GameCharacter {
    public Slash() {
        this.name = "Slash";
        this.guitar = new FenderTelecaster();
        this.solo = new GuitarOnFire();
    }
}

