import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMain() {
    int number=3;
    String example="Fizz";
    String result= Main.checkNumber(number);
    assertEquals(example,result);
    }
    @Test
    void testMain1() {
        int number=5;
        String example="Buzz";
        String result= Main.checkNumber(number);
        assertEquals(example,result);
    }
    @Test
    void testMain2() {
        int number=15;
        String example="FizzBuzz";
        String result= Main.checkNumber(number);
        assertEquals(example,result);
    }
    @Test
    void testMain3() {
        int number=26;
        String example="TwentySix";
        String result= Main.checkNumber(number);
        assertEquals(example,result);
    }
}