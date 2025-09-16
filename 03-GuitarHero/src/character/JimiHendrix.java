package character;

import guitar.GibsonSG;
import solo_act.GuitarSmash;

public class JimiHendrix extends GameCharacter {

    public JimiHendrix() {
        this.name = "Jimi Hendrix";
        this.guitar = new GibsonSG();
        this.solo = new GuitarSmash();
    }
}
