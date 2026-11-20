import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TVTest {

    @Test
    public void testThatTVTurnedOn(){
        TV tv = new TV();

        tv.turnOn();
        Assertions.assertTrue(tv.isOnn());
    }

    @Test
    public void testThatTVTurnedOff(){
        TV tv = new TV();

        tv.turnOn();
        tv.turnOff();
        Assertions.assertFalse(tv.isOnn());
    }

    @Test
    public void testThatTVVolumeCanNotBeIncreasedWhenTVIsOff(){
        TV tv = new TV();

        int initialVolume  = tv.getVolume();

        tv.increaseVolume();
        Assertions.assertEquals(initialVolume, tv.getVolume());
    }

    @Test
    public void testThatTVVolumeCanBeIncreaseWhenTVIsOn() {
        TV tv = new TV();

        tv.turnOn();
        tv.increaseVolume();
        Assertions.assertEquals(51, tv.getVolume());
    }

    @Test
    public void testThatTVVolumeCannotExceed100(){
        TV tv = new TV();

        tv.turnOn();
        for(int index = 0; index < 50; index++){
            tv.increaseVolume();
        }
        tv.increaseVolume();
        Assertions.assertEquals(100, tv.getVolume());
    }

    @Test
    public void testThatTVVolumeCanNotBeDecreasedWhenTVIsOff(){
        TV tv = new TV();

        int initialVolume  = tv.getVolume();

        tv.decreaseVolume();
        Assertions.assertEquals(initialVolume, tv.getVolume());
    }

    @Test
    public void testThatTVVolumeCanBeDecreaseWhenTVIsOn() {
        TV tv = new TV();

        tv.turnOn();
        tv.decreaseVolume();
        Assertions.assertEquals(49, tv.getVolume());
    }

    @Test
    public void testThatTVVolumeCannotGoBelowZero(){
        TV tv = new TV();

        tv.turnOn();
        for(int index = 50; index > 0; index--){
            tv.decreaseVolume();
        }
        tv.decreaseVolume();
        Assertions.assertEquals(0, tv.getVolume());
    }

    @Test
    public void testThatChannelCannotChangeWhenTVIsOff() {
        TV tv = new TV();

        tv.changeChannel();

        Assertions.assertEquals(3, tv.getChannel());
    }


    @Test
    public void testThatTVChannelCanBeChangedWhenTVIsOn() {
        TV tv = new TV();

        tv.turnOn();
        tv.changeChannel();

        Assertions.assertEquals(4, tv.getChannel());
    }

    @Test
    public void testThatChannelCannotExceed100() {
        TV tv = new TV();

        tv.turnOn();

        for (int index = 0; index < 100; index++) {
            tv.changeChannel();
        }

        Assertions.assertEquals(100, tv.getChannel());
    }

    @Test
    public void testThatChannelCannotDecreaseWhenTVIsOff() {
        TV tv = new TV();

        tv.decreaseChannel();

        Assertions.assertEquals(3, tv.getChannel());
    }

    @Test
    public void testThatChannelCannotGoBelow1() {
        TV tv = new TV();

        tv.turnOn();
        for (int i = 0; i < 2; i++) {
            tv.decreaseChannel();
        }

        Assertions.assertEquals(1, tv.getChannel());
    }

    @Test
    public void testThatTVCanBeMutedWhenTVIsOn() {
        TV tv = new TV();

        tv.turnOn();
        tv.mute();

        Assertions.assertTrue(tv.isMuted());
    }

    @Test
    public void testThatTVCannotBeMutedWhenTVIsOff() {
        TV tv = new TV();

        tv.mute();

        Assertions.assertFalse(tv.isMuted());
    }
}
