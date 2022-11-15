package pwo.seq;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class SeqTypeTest {

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
     * Test of values method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testValues() {
        System.out.println("values");
        SeqType[] expResult
                = {SeqType.FIB, SeqType.LUC, SeqType.TRI};
        SeqType[] result = SeqType.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of fromString method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testFromString() {
        System.out.println("fromString");
        String type = "fibonaci";
        SeqType expResult = SeqType.FIB;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);

    }

    @org.junit.jupiter.api.Test
    public void testFromStringTri() {
        System.out.println("fromString");
        String type = "tribonacci";
        SeqType expResult = SeqType.TRI;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);

    }

    @org.junit.jupiter.api.Test
    public void testFromStringLuc() {
        System.out.println("fromString");
        String type = "lucas";
        SeqType expResult = SeqType.LUC;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);

    }

    /**
     * Test of getGenerator method, of class SeqType.
     */
    @org.junit.jupiter.api.Test
    public void testGetGenerator() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.FIB;
        Generator result = instance.getGenerator();
        assertEquals(FibonacciGenerator.class, result.getClass());

    }
    
    @org.junit.jupiter.api.Test
    public void testGetGeneratorLuc() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.LUC;
        Generator result = instance.getGenerator();
        assertEquals(LucasGenerator.class, result.getClass());

    }
    
    @org.junit.jupiter.api.Test
    public void testGetGeneratorTri() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.TRI;
        Generator result = instance.getGenerator();
        assertEquals(TribonacciGenerator.class, result.getClass());

    }

}
