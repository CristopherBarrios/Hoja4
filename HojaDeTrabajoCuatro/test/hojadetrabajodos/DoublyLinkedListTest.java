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
public class DoublyLinkedListTest {
    
    public DoublyLinkedListTest() {
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
     * Test of size method, of class DoublyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class DoublyLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DoublyLinkedList instance = new DoublyLinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class DoublyLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int data = 0;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.push(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class DoublyLinkedList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class DoublyLinkedList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 0;
        int result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
