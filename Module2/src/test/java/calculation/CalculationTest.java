package calculation;

import org.junit.jupiter.api.Test;
import legacy.calculation.Calculation;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
    @Test
    public void findMaxPositiveSuccessful() {
        int inputPositive[] = new int[] {1,3,4,2};
        var maxResult = Calculation.findMax(inputPositive);

        int expectedMax = 4;

        assertEquals(expectedMax, maxResult);
    }

    @Test
    public void findMaxNegativeSuccessful() {
        int inputPositive[] = new int[] {-12,-1,-3,-4,-2};
        var maxResult = Calculation.findMax(inputPositive);

        int expectedMax = -1;

        assertEquals(expectedMax, maxResult);
    }
}
