package junit3;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit3Test {

	@org.junit.jupiter.api.Test
    void findMinMax() {
        assertAll(
                () -> assertArrayEquals(new int[]{1, 6}, junit3.findMinMax(new int[]{1, 2, 3, 4, 5, 6})),
                () -> assertArrayEquals(new int[]{1, 4}, junit3.findMinMax(new int[]{1, 2, 3, 4})),
                () -> assertArrayEquals(new int[]{1, 5}, junit3.findMinMax(new int[]{1, 2, 3, 4, 5})));
    }

    @org.junit.jupiter.api.Test
    void findMinMax2() {
        assertAll(
                () -> assertEquals("Min = 1 Max = 6", junit3.findMinMax2(new int[]{1, 2, 3, 4, 5, 6})),
                () -> assertEquals("Min = 1 Max = 4", junit3.findMinMax2(new int[]{1, 2, 3, 4})),
                () -> assertEquals("Min = 1 Max = 5", junit3.findMinMax2(new int[]{1, 2, 3, 4, 5})));
    }
}
