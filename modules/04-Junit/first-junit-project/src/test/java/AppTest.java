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
        assertEquals(expected, actual, "squareRoot Computation is incorrect"); 
        // The string here runs only when test fails.
    }

    @Test
    void CheckSqrtNotEqulas() {
        ComputeSquareroot obj = new ComputeSquareroot();
        assertNotEquals(8.0, obj.squareRoot(16), () -> "Value Matched");    //check for unexpected result should not be match.
        // Supplier Functional Interface, we can use lambda func here
    }

    @Test
    void checkStringsEqualsTest() {
        boolean result = StringEquality.checkEquals("Java", "Java");
        assertTrue(result);
        // Check for boolean values, if true -> test passes, else -> test fails.         
    }

    // Similarly we have assertFalse()

    

    
    
    
}
