package pwo.seq;

import java.math.BigDecimal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciGeneratorTest {

    public FibonacciGeneratorTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of reset method, of class FibonacciGenerator.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        FibonacciGenerator instance = new FibonacciGenerator();
        instance.reset();
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);

    }

    /**
     * Test of nextTerm method, of class FibonacciGenerator.
     */
    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");
        FibonacciGenerator instance = new FibonacciGenerator();
        instance.nextTerm();
        BigDecimal expResult = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);

    }

    @Test
    void testGetTerm() {
        System.out.println("getTerm");
        FibonacciGenerator instance = new FibonacciGenerator();
        BigDecimal expResult = new BigDecimal(55);
        BigDecimal result = instance.getTerm(10);
        assertEquals(expResult, result);
    }

}
