import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));
    }
}
