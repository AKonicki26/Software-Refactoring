package main;

public class MusicPlayer extends MediaPlayer {
    public MusicPlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        // Music playing specific engine code here
        System.out.printf("%s %s%n", fileName, "play");
    }

    @Override
    public void loop() {
        // Music looping specific engine code here
        System.out.printf("%s %s%n", fileName, "loop");
    }

    @Override
    public void stop() {
        // Music specific code here
        System.out.printf("%s %s%n", fileName, "stop");
    }
}
