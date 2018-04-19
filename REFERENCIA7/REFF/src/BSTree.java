/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cooli
 * @param <Key>
 * @param <Value>
 */
public interface BSTree<Key extends Comparable<Key>,Value> {
    /**
     * 
     * @param key key
     * @param value value
     */
    public void put(Key key, Value value);
    
    public Value get(Key key);
    
    public void displayFinal();
    
}
