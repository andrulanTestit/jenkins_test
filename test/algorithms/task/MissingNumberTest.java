package algorithms.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class MissingNumberTest {

    @Test
    public void test() {
        MissingNumber missingNumber = new MissingNumber();

        assertEquals(8, missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}