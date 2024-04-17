import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(5));
        assertTrue(PrimeChecker.isPrime(7));
        assertTrue(PrimeChecker.isPrime(11));
        assertTrue(PrimeChecker.isPrime(13));
        assertTrue(PrimeChecker.isPrime(17));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(6));
        assertFalse(PrimeChecker.isPrime(8));
        assertFalse(PrimeChecker.isPrime(9));
        assertFalse(PrimeChecker.isPrime(10));
        assertFalse(PrimeChecker.isPrime(15));
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(PrimeChecker.isPrime(-1));
        assertFalse(PrimeChecker.isPrime(-2));
        assertFalse(PrimeChecker.isPrime(-3));
    }

    @Test
    public void testIsPrimeWithZero() {
        assertFalse(PrimeChecker.isPrime(0));
    }
}
