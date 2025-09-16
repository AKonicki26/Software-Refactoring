package character;

import guitar.Guitar;
import solo_act.SoloAct;

public abstract class GameCharacter {
    protected SoloAct solo;
    protected Guitar guitar;

    protected String name;
    public  String getName() {
        return name;
    }

    public void setSolo(SoloAct solo) {
        this.solo = solo;
    }

    public void playSolo() {
        solo.perform();
    }

    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }

    public void playGuitar() {
        System.out.println(getName() + " is playing a " + guitar.getName());
        guitar.play();
    }
}
