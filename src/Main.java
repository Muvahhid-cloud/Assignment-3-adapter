public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new Mp3Player();

        player.play("song.mp3");
        player.play("recording.wav");
        player.play("video.mp4");
        player.play("presentation.pptx");
    }
}
