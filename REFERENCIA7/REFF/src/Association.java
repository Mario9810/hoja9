
import java.util.Map;




public class Association<K extends Comparable<K>,V> implements Map.Entry<K,V>
{
  
    protected K theKey; // the key of the key-value pair
   
    protected V theValue; // the value of the key-value pair

  
    public Association(K key, V value)
    {
        assert (key != null);
        theKey = key;
        theValue = value;
    }

 
    public Association(K key)
    {
        this(key,null);
    }

    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }
    
  
    public int hashCode()
    {
        return getKey().hashCode();
    }
    
 
    public V getValue()
    {
        return theValue;
    }

 
    public K getKey()
    {
        return theKey;
    }

 
    public V setValue(V value)
    {
        V oldValue = theValue;
        theValue = value;
        return oldValue;
    }


    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append(" - "+getKey()+": "+getValue()+"\n");
        return s.toString();
    }

    public int compareTo(K key){
        return this.theKey.compareTo(key);
    }

}