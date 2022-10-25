import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testFindNextDay() {
        int month = 1;
        int day = 1;
        int expected = 2;
        int result = NextDayCalculator.findNextDay(day,month);
        assertEquals(expected,result);
    }
}