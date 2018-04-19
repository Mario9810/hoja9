/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cooli
 */
public class SplayBSTTest {
    
    public SplayBSTTest() {
    }

    /**
     * Test of contains method, of class SplayBST.
     */
    @Test
    public void testContains() {
        SplayBST<String,String> test = new SplayBST<String,String>();
        test.put("uno","1");
        assertEquals("1",(test.get("uno")));
    }

    /**
     * Test of display method, of class SplayBST.
     */
    @Test
    public void testDisplay() {
    }

    /**
     * Test of get method, of class SplayBST.
     */
    @Test
    public void testGet() {
        SplayBST<String,String> test = new SplayBST<String,String>();
        test.put("uno","1");
        assertEquals("1",(test.get("uno")));
    }

    /**
     * Test of put method, of class SplayBST.
     */
    @Test
    public void testPut() {
        SplayBST<String,String> test = new SplayBST<String,String>();
        test.put("uno","1");
        assertEquals(1,test.size());
    }

    /**
     * Test of remove method, of class SplayBST.
     */
    @Test
    public void testRemove() {
    }

    /**
     * Test of height method, of class SplayBST.
     */
    @Test
    public void testHeight() {
    }

    /**
     * Test of size method, of class SplayBST.
     */
    @Test
    public void testSize() {
    }
    
    
}
