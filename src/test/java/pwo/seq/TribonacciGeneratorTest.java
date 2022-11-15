package pwo.seq;

import java.math.BigDecimal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TribonacciGeneratorTest {
    
    public TribonacciGeneratorTest() {
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
     * Test of reset method, of class TribonacciGenerator.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        TribonacciGenerator instance = new TribonacciGenerator();
        instance.reset();
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);

    }

    /**
     * Test of nextTerm method, of class TribonacciGenerator.
     */
    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");
        TribonacciGenerator instance = new TribonacciGenerator();
        instance.nextTerm();
        BigDecimal expResult = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);

    }

    @Test
    void testGetTerm() {
        System.out.println("getTerm");
        TribonacciGenerator instance = new TribonacciGenerator();
        BigDecimal expResult = new BigDecimal(55);
        BigDecimal result = instance.getTerm(10);
        assertEquals(expResult, result);
    }
    
}
