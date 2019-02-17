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
public class PilaArrayListTest {
    
    public PilaArrayListTest() {
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
     * Test of push method, of class PilaArrayList.
     */
    

    /**
     * Test of pop method, of class PilaArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        PilaArrayList instance = new PilaArrayList();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class PilaArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PilaArrayList instance = new PilaArrayList();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class PilaArrayList.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        PilaArrayList instance = new PilaArrayList();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class PilaArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PilaArrayList instance = new PilaArrayList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
