import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.unittest.*;
public class AppTest {

    @Test
    void ReverseStringTestSingleWord() {
        ReverseString obj = new ReverseString();
        String actual = obj.reverse("Java");
        String expected = "avaJ";
        assertEquals(expected, actual);
    }
    @Test
    void ReverseStringTestMultipleWords() {
        ReverseString obj = new ReverseString();
        String actual = obj.reverse("Hello Aliens...!!");
        String expected = "!!...sneilA olleH";
        assertEquals(expected, actual);
    }
    
    // Test-Driven Development
    
    @Test
    void ComputeSquarerootTest() {
        ComputeSquareroot obj = new ComputeSquareroot();
        double actual = obj.squareRoot(16);
        double expected = 4.0;
        assertEquals(expected, actual, "Sqrt computation is incorrect.");
        // The string displays only when test case fails.
    }
    @Test
    void checkSqrtNotEquals() {
        ComputeSquareroot obj = new ComputeSquareroot();
        assertNotEquals(8.0, obj.squareRoot(16), () -> "Sqrt computation is incorrect.");        // check for unexpected value should not be the output.
        // we can use the supplier functional interface as Lambda func.
    }
    @Test
    void checkStringsEqualityTest() {
        boolean result = StringEquality.checkEquals("Java", "Java");
        assertTrue(result);
        // Check for boolean result true, if result = true -> test passes, else -> test fails.
    }

    // We also have the assertFalse().
}
