
import character.GameCharacter;
import character.JimiHendrix;
import character.Slash;
import guitar.FenderTelecaster;
import guitar.GibsonSG;
import solo_act.GuitarOnFire;
import solo_act.StageJump;


public class Main {
    public static void main(String[] args) {
        var player = new Slash();
        var player2 = new JimiHendrix();

        // print just the character names
        System.out.println(player.getName());
        System.out.println(player2.getName());

        // each player plays their guitar
        player.playGuitar();
        player2.playGuitar();

        // each player does a solo
        player.playSolo();
        player2.playSolo();

        // change each player's solo and guitar
        player.setGuitar(new GibsonSG());
        player.setSolo(new StageJump());
        player2.setGuitar(new FenderTelecaster());
        player2.setSolo(new GuitarOnFire());

        // repeat guitar playing and solos
        player.playGuitar();
        player2.playGuitar();

        player.playSolo();
        player2.playSolo();
    }

}