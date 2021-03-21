package main.java.structural.adapter;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 * 通过适配器MediaAdapter ，我们只需要对外暴露本类即可
 * 将之前的要暴露两个类进行了适配，这样在结构上达到了优化
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    /**
     * 以前的话AdvancedMediaPlayer 是单独对外暴露，通过适配器只对外暴露一个，
     *    适配器模式下具体暴露哪一个类，要具体讨论，个人认为就兼容性上来看，应该是暴露低级别，且已被系统
     *    调用的接口。
     *
     *
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("val")
                || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
