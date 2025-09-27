public class Mp3Player implements MediaPlayer {
    private AudioAdapter adapter;

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (fileName.endsWith(".wav") || fileName.endsWith(".mp4")) {
            adapter = new AudioAdapter(fileName);
            adapter.play(fileName);
        } else {
            System.out.println("Invalid media format: " + fileName);
        }
    }
}
