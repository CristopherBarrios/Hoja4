/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajodos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author moyha
 */
public class PilaVectorTest {
    
    public PilaVectorTest() {
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
     * Test of push method, of class PilaVector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = 3;
        PilaVector instance = new PilaVector();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class PilaVector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaVector instance = new PilaVector();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class PilaVector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PilaVector instance = new PilaVector();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class PilaVector.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        PilaVector instance = new PilaVector();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class PilaVector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PilaVector instance = new PilaVector();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
