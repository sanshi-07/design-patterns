package main.java.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void plaVal(String fileName) {

    }

    @Override
    public void playMp4(String filName) {
        System.out.println("play mp4:" + filName);
    }
}
