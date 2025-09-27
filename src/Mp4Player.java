public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playWav(String fileName) {}

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
