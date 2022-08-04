package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void translate5() {
        int number = 5;
        String expect = "Buzz";
        String result = FizzBuzz.translate(number);
        assertEquals(result,expect);
    }
    @Test
    void translate3() {
        int number = 3;
        String expect = "Fizz";
        String result = FizzBuzz.translate(number);
        assertEquals(result,expect);
    }
    @Test
    void translate15() {
        int number = 15;
        String expect = "FizzBuzz";
        String result = FizzBuzz.translate(number);
        assertEquals(result,expect);
    }
}