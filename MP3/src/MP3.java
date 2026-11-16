public class MP3 {
    private boolean on = false;
    private boolean playing = false;
    private int volume = 50;
    private int currentSong = 1;

    public void turnOn() {
        on = true;    }

    public boolean isOn() {
        return on;
    }

    public void turnOff() {

        on = false;
        playing = false;
    }

    public void play() {
        if (on == false) {
            return;
        }

        playing = true;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void pause() {
        playing = false;
    }

    public void stop() {

        playing = false;
        currentSong = 1;
    }

    public void increaseVolume() {
        if (on == false) {
            return;
        }

        if (volume < 100) {
            volume++;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if (on == false) {
            return;
        }

        if (volume > 0) {
            volume--;
        }
    }

    public void nextSong() {
        if (on == false) {
            return;
        }

        currentSong++;
    }

    public int getCurrentSong() {
        return currentSong;
    }

    public void previousSong() {
        if (on == false) {
            return;
        }

        if (currentSong > 1) {
            currentSong--;
        }
    }
}
