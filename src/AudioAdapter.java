public class AudioAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public AudioAdapter(String fileName) {
        if (fileName.endsWith(".wav")) {
            advancedMusicPlayer = new WavPlayer();
        } else if (fileName.endsWith(".mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".wav")) {
            advancedMusicPlayer.playWav(fileName);
        } else if (fileName.endsWith(".mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
