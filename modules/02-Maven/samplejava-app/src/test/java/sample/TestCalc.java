package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.vk.sample.Calc;

public class TestCalc {
    @Test
    void testCalc(){
        Calc c = new Calc();
        int actualResult = c.divide(10, 5);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }
}
