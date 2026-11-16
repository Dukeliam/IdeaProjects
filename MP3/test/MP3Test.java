import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MP3Test {

    @Test
    public void testThatMP3TurnsOn() {
        MP3 mp3 = new MP3();

        mp3.turnOn();

        Assertions.assertTrue(mp3.isOn());
    }

    @Test
    public void testThatMP3TurnsOff() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.turnOff();

        Assertions.assertFalse(mp3.isOn());
    }

    @Test
    public void testThatMP3CanPlayMusic() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();

        Assertions.assertTrue(mp3.isPlaying());
    }

    @Test
    public void testThatTurningOffMP3StopsMusic() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();
        mp3.turnOff();

        Assertions.assertFalse(mp3.isPlaying());
    }

    @Test
    public void testThatMP3CanPlayAgainAfterRestarting() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();
        mp3.turnOff();
        mp3.turnOn();
        mp3.play();

        Assertions.assertTrue(mp3.isPlaying());
    }

    @Test
    public void testThatMP3CannotPlayWhenOff() {
        MP3 mp3 = new MP3();

        mp3.play();

        Assertions.assertFalse(mp3.isPlaying());
    }

    @Test
    public void testThatMP3CanPauseMusic() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();
        mp3.pause();

        Assertions.assertFalse(mp3.isPlaying());
    }

    @Test
    public void testThatPauseDoesNothingWhenMP3IsOff() {
        MP3 mp3 = new MP3();

        mp3.pause();

        Assertions.assertFalse(mp3.isPlaying());
        Assertions.assertFalse(mp3.isOn());
    }

    @Test
    public void testThatPauseKeepsCurrentSong() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.nextSong();
        mp3.play();

        mp3.pause();

        Assertions.assertEquals(2, mp3.getCurrentSong());
        Assertions.assertFalse(mp3.isPlaying());
    }

    @Test
    public void testThatMP3CanResumeAfterPause() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();
        mp3.pause();
        mp3.play();

        Assertions.assertTrue(mp3.isPlaying());
    }

    @Test
    public void testThatStopDoesNothingWhenMP3IsOff() {
        MP3 mp3 = new MP3();

        mp3.stop();

        Assertions.assertFalse(mp3.isPlaying());
        Assertions.assertFalse(mp3.isOn());
    }

    @Test
    public void testThatMP3CanStopMusic() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();
        mp3.stop();

        Assertions.assertFalse(mp3.isPlaying());
    }

    @Test
    public void testThatStopReturnsToFirstSong() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.nextSong();
        mp3.nextSong();

        mp3.stop();

        Assertions.assertEquals(1, mp3.getCurrentSong());
    }

    @Test
    public void testThatMP3RemainsOnAfterIncreasingVolume() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.increaseVolume();

        Assertions.assertTrue(mp3.isOn());
    }

    @Test
    public void testThatMP3CanIncreaseVolume() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.increaseVolume();

        Assertions.assertEquals(51, mp3.getVolume());
    }

    @Test
    public void testThatVolumeCannotExceed100() {
        MP3 mp3 = new MP3();

        mp3.turnOn();

        for (int i = 0; i < 51; i++) {
            mp3.increaseVolume();
        }

        Assertions.assertEquals(100, mp3.getVolume());
    }

    @Test
    public void testThatMP3CanDecreaseVolume() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.decreaseVolume();

        Assertions.assertEquals(49, mp3.getVolume());
    }

    @Test
    public void testThatMP3CannotDecreaseVolumeWhenOff() {
        MP3 mp3 = new MP3();

        mp3.decreaseVolume();

        Assertions.assertEquals(50, mp3.getVolume());
    }

    @Test
    public void testThatVolumeCannotGoBelowZero() {
        MP3 mp3 = new MP3();

        mp3.turnOn();

        for (int i = 0; i < 51; i++) {
            mp3.decreaseVolume();
        }

        Assertions.assertEquals(0, mp3.getVolume());
    }

    @Test
    public void testThatMP3CanSkipToNextSong() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();
        mp3.nextSong();

        Assertions.assertEquals(2, mp3.getCurrentSong());
    }

    @Test
    public void testThatMP3CannotSkipSongWhenOff() {
        MP3 mp3 = new MP3();

        mp3.nextSong();

        Assertions.assertEquals(1, mp3.getCurrentSong());
        Assertions.assertFalse(mp3.isOn());
    }

    @Test
    public void testThatMP3CanReturnToPreviousSong() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.play();
        mp3.nextSong();
        mp3.previousSong();

        Assertions.assertEquals(1, mp3.getCurrentSong());
    }

    @Test
    public void testThatMP3CannotGoToPreviousSongWhenOff() {
        MP3 mp3 = new MP3();

        mp3.previousSong();

        Assertions.assertEquals(1, mp3.getCurrentSong());
        Assertions.assertFalse(mp3.isOn());
    }

    @Test
    public void testThatPreviousSongCannotGoBelowOne() {
        MP3 mp3 = new MP3();

        mp3.turnOn();
        mp3.previousSong();

        Assertions.assertEquals(1, mp3.getCurrentSong());
    }
}
