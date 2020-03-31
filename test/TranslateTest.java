import org.junit.Test;

import static org.junit.Assert.*;

public class TranslateTest {

    @Test
    public void resultTest1() {
        int inputNumber = 0;
        String expected = "khong";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest2() {
        int inputNumber = 9;
        String expected = "chin";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest3() {
        int inputNumber = 10;
        String expected = "muoi";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest4() {
        int inputNumber = 16;
        String expected = "muoi sau";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest5() {
        int inputNumber = 99;
        String expected = "chin muoi chin";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest6() {
        int inputNumber = 100;
        String expected = "OUT OF RANGE";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest7() {
        int inputNumber = -1;
        String expected = "OUT OF RANGE";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest9() {
        int inputNumber = 19;
        String expected = "muoi chin";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    public void resultTest10() {
        int inputNumber = 69;
        String expected = "sau muoi chin";
        String result = FizzBuzzResult.translate(inputNumber);
        assertEquals(expected, result);
    }
}