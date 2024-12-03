public class YourBinaryTree extends BinaryTree {
    @Override
    protected int countLessThan(Comparable value) {
        if (value == null) {         //check for null
            throw new IllegalArgumentException("value is null"); 
        }
        return helperCount(value, this.root); 
    }
    
    private int helperCount (Comparable x, Node n) {
        int count = 0; 
        if (n == null) {
            return 0; 
        } else if (n.value.compareTo(x) > 0) {
            count++; 
            return count + helperCount(x, n.right) + helperCount(x, n.left);
        }

        /*
        this last return statement is important so that we continue to increment count 
        even in cases where the current node we're working on isn't null, or when the node's value
        actually isn't greater than the passed value Comparable x. So either way when neither of those
        conditions are true, we still have to continue checking the tree. This final return statement
        ensures that: 
        
        */
        return helperCount(x, n.right) + helperCount(x, n.left);  
    }
    
    
}