
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BikeTest {

    @Test
    public void testThatBikeCanBeTurnedOn() {
        Bike bike = new Bike();

        bike.turnOn();
        Assertions.assertTrue(bike.isPoweredOn());
    }

    @Test
    public void testThatBikeCanBeTurnedOff() {
        Bike bike = new Bike();

        bike.turnOn();
        bike.turnOff();
        Assertions.assertFalse(bike.isPoweredOn());
    }

    @Test
    public void testThatBikeCannotAccelerateWhenOff() {
        Bike bike = new Bike();

        bike.accelerate();
        Assertions.assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testThatBikeCannotDecelerateWhenOff() {
        Bike bike = new Bike();

        bike.decelerate();
        Assertions.assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testThatBikeAcceleratesInGearOne() {
        Bike bike = new Bike();

        bike.turnOn();
        bike.accelerate();
        Assertions.assertEquals(1, bike.getSpeed());
        Assertions.assertEquals(1, bike.getGear());
    }

    @Test
    public void testThatBikeAutomaticallyChangesToGearTwo() {
        Bike bike = new Bike();

        bike.turnOn();
        for (int index = 0; index < 21; index++) {
            bike.accelerate();
        }
        Assertions.assertEquals(21, bike.getSpeed());
        Assertions.assertEquals(2, bike.getGear());
    }

    @Test
    public void testThatBikeAcceleratesInGearTwo() {
        Bike bike = new Bike();

        bike.turnOn();
        for (int index = 0; index < 21; index++) {
            bike.accelerate();
        }
        bike.accelerate();
        Assertions.assertEquals(23, bike.getSpeed());
        Assertions.assertEquals(2, bike.getGear());
    }

    @Test
    public void testThatBikeAcceleratesInGearThree() {
        Bike bike = new Bike();

        bike.turnOn();
        for (int index = 0; index < 26; index++) {
            bike.accelerate();
        }
        bike.accelerate();
        Assertions.assertEquals(34, bike.getSpeed());
        Assertions.assertEquals(3, bike.getGear());
    }

    @Test
    public void testThatBikeAcceleratesInGearFour() {
        Bike bike = new Bike();

        bike.turnOn();
        for (int index = 0; index < 30; index++) {
            bike.accelerate();
        }
        bike.accelerate();
        Assertions.assertEquals(47, bike.getSpeed());
        Assertions.assertEquals(4, bike.getGear());
    }

    @Test
    public void testThatBikeDeceleratesInGearFourToGearThree() {
        Bike bike = new Bike();

        bike.turnOn();
        for (int index = 0; index < 30; index++) {
            bike.accelerate();
        }
        bike.decelerate();
        Assertions.assertEquals(39, bike.getSpeed());
        Assertions.assertEquals(3, bike.getGear());
    }
}
