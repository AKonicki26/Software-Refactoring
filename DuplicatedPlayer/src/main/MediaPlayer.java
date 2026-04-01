package main;

public abstract class MediaPlayer {
    protected String fileName;
    public abstract void play();
    public abstract void loop();
    public abstract void stop();

    public void setFileName(String fileName) { this.fileName = fileName; }
}
