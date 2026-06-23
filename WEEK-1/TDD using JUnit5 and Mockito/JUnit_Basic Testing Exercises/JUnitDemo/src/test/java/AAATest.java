import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class AAATest {

    private int num1;
    private int num2;

    @Before
    public void setUp() {
        System.out.println("Setup method executed");
        num1 = 2;
        num2 = 3;
    }

    @After
    public void tearDown() {
        System.out.println("Teardown method executed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 5;

        // Act
        int actual = num1 + num2;

        // Assert
        assertEquals(expected, actual);
    }
}