package main;

public class Player {
    private boolean isMp3;
    private String fileName;

    public Player(String fileName) {
        this.isMp3 = true;
        this.fileName = fileName;
    }

    public void setFileFormatToMp3(boolean isMp3) {
        this.isMp3 = isMp3;
    }

    public void play() {
        if (isMp3) {
            playMusic();
        } else {
            playVideo();
        }
    }

    public void loop() {
        if (isMp3) {
            loopMusic();
        } else {
            loopVideo();
        }
    }

    public void stop() {
        if (isMp3) {
            stopMusic();
        } else {
            stopVideo();
        }
    }

    private void playMusic() {
        // Music playing specific engine code here
        System.out.printf("%s %s%n", fileName, "play");
    }

    private void loopMusic() {
        // Music looping specific engine code here
        System.out.printf("%s %s%n", fileName, "loop");
    }

    private void stopMusic() {
        // Music specific code here
        System.out.printf("%s %s%n", fileName, "stop");
    }

    private void playVideo() {
        // Video playing specific engine code here
        System.out.printf("%s %s%n", fileName, "play");
    }

    private void loopVideo() {
        // Music looping specific engine code here
        System.out.printf("%s %s%n", fileName, "loop");
    }

    private void stopVideo() {
        // Music specific code here
        System.out.printf("%s %s%n", fileName, "stop");
    }
}
