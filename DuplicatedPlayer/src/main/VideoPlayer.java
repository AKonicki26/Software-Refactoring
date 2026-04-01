package main;

public class VideoPlayer extends MediaPlayer {
    public VideoPlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        // Video playing specific engine code here
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
