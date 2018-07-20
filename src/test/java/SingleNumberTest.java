/**
 * Created by alexm on 20.07.2018.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    @Test
    public void testGenerateRandomNumbersArray() {
        assertEquals(11, SingleNumber.generateRandomNumbersArray(11).length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateRandomNumbersArrayThrowsException() {
        SingleNumber.generateRandomNumbersArray(10);
    }

    @Test
    public void testShuffleArray() {
        int[] mockNumbers = new int[10];
        for (int i = 0; i < mockNumbers.length; i++) {
            mockNumbers[i] = i;
        }

        assertFalse("Given array should be shuffled!!!", mockNumbers.equals(SingleNumber.shuffleArray(mockNumbers)));
    }


    @Test
    public void testFindSingleNumber() {
        assertSame(2, SingleNumber.findSingleNumber( new int[]{1, 1, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSingleNumberThrowsException() {
        SingleNumber.findSingleNumber(new int[]{1, 1, 2, 2});
    }

}
