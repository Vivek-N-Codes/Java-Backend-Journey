import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.unittest.ComputeSquareroot;

public class TestBeforeAfter {
    ComputeSquareroot obj = new ComputeSquareroot();

    @BeforeEach
    void init(){
        System.out.println("Before Test");
    }

    @Test
    void testSqrt(){
        assertEquals(4.0, obj.squareRoot(16) );
    }

    @Test
    void testNotequal(){
        assertNotEquals(8.0, obj.squareRoot(16));
    }
}
