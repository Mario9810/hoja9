/**
 * OBTENIDA DE https://github.com/Arsenalist/Red-Black-Tree-Java-Implementation/blob/master/src/RedBlackNode.java
 */ 

// class RedBlackNode
class RedBlackNode<Key extends Comparable<Key>, Value> {
;
    /** Possible color for this node */
    public static final int BLACK = 0;
    /** Possible color for this node */
    public static final int RED = 1;
	// the key of each node
	public Key key;
        public Value value;
        Association<Key, Value> data;
        
    /** Parent of node */
    RedBlackNode<Key, Value> parent;
    /** Left child */
    RedBlackNode<Key, Value> left;
    /** Right child */
    RedBlackNode<Key, Value> right;
    // the number of elements to the left of each node
    public int numLeft = 0;
    // the number of elements to the right of each node
    public int numRight = 0;
    // the color of a node
    public int color;

    RedBlackNode(){
        color = BLACK;
        numLeft = 0;
        numRight = 0;
        parent = null;
        left = null;
        right = null;
    }

	// Constructor which sets key to the argument.
	RedBlackNode(Key key, Value value){
        this();
        this.data = new Association<Key, Value>(key, value);
        this.key = key;
        this.value=value;
	}
        
        public Value getValue(){
            return value;
        }
}// end class RedBlackNode
