package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import main.MusicPlayer;
import main.VideoPlayer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.*;

class PlayerTest {

    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    void testPlayMp3MusicFile() {
        MusicPlayer musicPlayer = new MusicPlayer("I will survive");

        musicPlayer.play();
        musicPlayer.loop();
        musicPlayer.stop();

        String expected = "I will survive play" + System.lineSeparator() +
                "I will survive loop" + System.lineSeparator() +
                "I will survive stop" + System.lineSeparator();

        assertEquals(expected, out.toString());
    }

    @Test
    void testPlayVideoFile() {
        VideoPlayer videoPlayer = new VideoPlayer("Till the end");

        videoPlayer.play();
        videoPlayer.loop();
        videoPlayer.stop();

        String expected = "Till the end play" + System.lineSeparator()
                + "Till the end loop" + System.lineSeparator()
                + "Till the end stop" + System.lineSeparator();

        assertEquals(expected, out.toString());
    }

}
