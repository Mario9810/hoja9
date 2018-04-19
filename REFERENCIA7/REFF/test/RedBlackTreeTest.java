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
public class RedBlackTreeTest {
    
    public RedBlackTreeTest() {
    }

    /**
     * Test of insert method, of class RedBlackTree.
     */
    @Test
    public void testInsert() {
        RedBlackTree<String,String> test = new RedBlackTree<String,String>();
        test.insert("uno","1");
        assertEquals(1,test.size());
    }

    /**
     * Test of treeMinimum method, of class RedBlackTree.
     */
    @Test
    public void testTreeMinimum() {
    }

    /**
     * Test of treeSuccessor method, of class RedBlackTree.
     */
    @Test
    public void testTreeSuccessor() {
    }

    /**
     * Test of remove method, of class RedBlackTree.
     */
    @Test
    public void testRemove() {
    }

    /**
     * Test of find method, of class RedBlackTree.
     */
    @Test
    public void testFind() {
    }

    /**
     * Test of display method, of class RedBlackTree.
     */
    @Test
    public void testDisplay() {
    }

    /**
     * Test of search method, of class RedBlackTree.
     */
    @Test
    public void testSearch() {
        
        RedBlackTree<String,String> test = new RedBlackTree<String,String>();
        test.insert("uno","1");
        assertEquals(false,isNull(test.search("uno")));
        
    }

    /**
     * Test of numGreater method, of class RedBlackTree.
     */
    @Test
    public void testNumGreater() {
    }

    /**
     * Test of numSmaller method, of class RedBlackTree.
     */
    @Test
    public void testNumSmaller() {
    }

    /**
     * Test of findNumGreater method, of class RedBlackTree.
     */
    @Test
    public void testFindNumGreater() {
    }

    /**
     * Test of getGreaterThan method, of class RedBlackTree.
     */
    @Test
    public void testGetGreaterThan() {
    }

    /**
     * Test of findNumSmaller method, of class RedBlackTree.
     */
    @Test
    public void testFindNumSmaller() {
    }

    /**
     * Test of size method, of class RedBlackTree.
     */
    @Test
    public void testSize() {
    }
    
    public boolean isNull(RedBlackNode root){
        boolean x = true;
        if(root==null){
            x=true;
        }
        else{
            x=false;
        }
        return x;
    }
    
    
}
