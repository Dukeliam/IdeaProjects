import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AirConditionerTest {

    @Test
    public void testIsTheAcTurnedOn(){
        AirConditioner ac = new AirConditioner();

        ac.turnOn();
        Assertions.assertTrue(ac.isOn());
    }

    @Test
    public void testIsTheAcTurnedOff(){
        AirConditioner ac = new AirConditioner();

        ac.turnOn();
        ac.isOn();
        ac.turnOff();
        Assertions.assertFalse(ac.isOn());
    }
    @Test
    public void testThatTheCanIncearse(){
        AirConditioner ac = new AirConditioner();

        ac.increaseTemperature();
        Assertions.assertEquals(21, ac.getTemperature());
    }

    @Test
    public void testThatTheAcCanDecrease(){
        AirConditioner ac = new AirConditioner();

        ac.decreaseTemprature();
        Assertions.assertEquals(19, ac.getTemperature());
    }
    @Test
    public void testThatWhenCanNotGoBeyondThrity(){
        AirConditioner ac = new AirConditioner();

        for (int index = 0; index < 10; index++){
            ac.increaseTemperature();
        }
        ac.increaseTemperature();
        Assertions.assertEquals(30, ac.getTemperature());
    }

    @Test
    public void testThatWhenCanNotGoBelowSixteen(){
        AirConditioner ac = new AirConditioner();

        for (int index = 0; index < 4; index++){
            ac.decreaseTemprature();
        }
        ac.decreaseTemprature();
        Assertions.assertEquals(16, ac.getTemperature());
    }
}
