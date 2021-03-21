package main.java.structural.adapter;

public class ValPlayer implements AdvancedMediaPlayer {
    @Override
    public void plaVal(String fileNAme) {
        System.out.println("play val :" + fileNAme);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
