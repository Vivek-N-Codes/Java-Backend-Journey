import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.unittest.ComputeSquareroot;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)  
// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBeforeAfter {
    ComputeSquareroot obj = new ComputeSquareroot();

    TestBeforeAfter(){
        System.out.println("Test Obj get created before test method");
    }

    @BeforeAll          // Executes only once for all test cases.
    static void  beforeALL(){
        System.out.println("Before all Test cases");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all Test Cases run.");
    }

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

    @AfterEach
    void destroy(){
        System.out.println("After Test, close!");
    }

}
