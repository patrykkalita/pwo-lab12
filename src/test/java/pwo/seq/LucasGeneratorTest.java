package pwo.seq;

import java.math.BigDecimal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LucasGeneratorTest {
    
    public LucasGeneratorTest() {
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
     * Test of reset method, of class LucasGenerator.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        LucasGenerator instance = new LucasGenerator();
        instance.reset();
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);

    }

    /**
     * Test of nextTerm method, of class LucasGenerator.
     */
    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");
        LucasGenerator instance = new LucasGenerator();
        instance.nextTerm();
        BigDecimal expResult = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);

    }

    @Test
    void testGetTerm() {
        System.out.println("getTerm");
        LucasGenerator instance = new LucasGenerator();
        BigDecimal expResult = new BigDecimal(55);
        BigDecimal result = instance.getTerm(10);
        assertEquals(expResult, result);
    }
    
}
