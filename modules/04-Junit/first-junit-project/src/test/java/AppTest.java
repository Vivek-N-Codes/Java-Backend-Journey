import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(expected, actual);
    }
    
    
}
