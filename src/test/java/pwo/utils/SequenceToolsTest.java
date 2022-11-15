package pwo.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pwo.seq.FibonacciGenerator;

public class SequenceToolsTest {

    static String expFibLine, expFibColumn;
    static SequenceGenerator fibGen;
    static int from, to;

    public SequenceToolsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        expFibLine = "0 1 1 2 3 5 8 13 21 34 55";
        expFibColumn = "0\n1\n1\n2\n3\n5\n8\n13\n21\n34\n55";
        from = 0;
        to = 10;
        fibGen = new FibonacciGenerator();

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
     * Test of getTermsAsColumn method, of class SequenceTools.
     */
    @Test
    public void testGetTermsAsColumn() {
        System.out.println("getTermsAsColumn");
        String result
                = SequenceTools.getTermsAsColumn(fibGen, from, to);
        assertEquals(expFibColumn, result);

    }

    /**
     * Test of getTermsAsLine method, of class SequenceTools.
     */
    @Test
    public void testGetTermsAsLine() {
        System.out.println("getTermsAsLine");
        String result
                = SequenceTools.getTermsAsLine(fibGen, from, to);
        assertEquals(expFibLine, result);
    }

    /**
     * Test of writeToFile method, of class SequenceTools.
     */
    @Test
    public void testWriteToFile() {
        System.out.println("writeToFile");
        SequenceGenerator sg = null;
        int from = 0;
        int to = 0;
        String fileName = "";
        boolean expResult = false;
        boolean result = SequenceTools.writeToFile(sg, from, to, fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
