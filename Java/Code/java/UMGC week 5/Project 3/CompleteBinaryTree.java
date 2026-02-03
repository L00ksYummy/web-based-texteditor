import java.util.ArrayList;
import java.util.Collections;

public class CompleteBinaryTree {

    protected TreeNode root;

    /**
     * A static nested class representing a node in the binary tree.
     * Contains an integer value and references to left and right children.
     */
    public static class TreeNode {
        protected Integer value;
        protected TreeNode left;
        protected TreeNode right;

        /**
         * Constructs a TreeNode with a given integer value.
         * 
         * @param value the value to store in the node
         */
        public TreeNode(Integer value) {
            this.value = value;
        }
    }

    /**
     * Constructs a CompleteBinaryTree from an array of Integer values that
     * represent a complete binary tree in level-order.
     * 
     * If the input array is not null and contains elements, it initializes the
     * root of the tree by calling the recursive method `makeNode`, starting from
     * index 0.
     * 
     * @param values an array of Integer values representing the binary tree
     *               in level-order
     * @throws InvalidTreeException if the array contains a null element
     *                              where a node is expected
     */
    public CompleteBinaryTree(Integer[] values) throws InvalidTreeException {
        if (values != null && values.length > 0) {
            root = makeNode(values, 0);
        }
    }

    public CompleteBinaryTree(String levelOrderedValues) throws InvalidTreeException {
        if (levelOrderedValues == null || levelOrderedValues.trim().isEmpty()){
            root = null;
            return;
        }
        String[] tokens = levelOrderedValues.split("\\s+");
        Integer[] values = new Integer[tokens.length];

        for (int i = 0; i < values.length; i++){
            try {
                values[i] = Integer.valueOf(tokens[i]);
            } catch (NumberFormatException e) {
                throw new InvalidTreeException ("Tree values must be an integer: " + tokens[i] + " is wrong");
            }
        }

        root = makeNode(values, 0);
    }

    /**
     * Recursively constructs a complete binary tree from an array.
     * The array is assumed to represent a complete binary tree in level-order
     * traversal.
     * 
     * For each index `i` in the array:
     * - The element at index `i` represents the node.
     * - The left child of the node is at index `2*i + 1`.
     * - The right child of the node is at index `2*i + 2`.
     * 
     * This method constructs the tree in a level-by-level manner.
     * 
     * @param values array of integer values representing the tree in
     *               level-order
     * @param index  current index in the array that corresponds to the
     *               current node
     * @return TreeNode at the current index, with left and right children
     *         recursively constructed
     * @throws InvalidTreeException if a node value is null or invalid
     */
    protected TreeNode makeNode(Integer[] values, int index) throws InvalidTreeException {
        if (index >= values.length) {
            return null;
        }
        if (values[index] == null) {
            throw new InvalidTreeException("Node element must not be null");
        }

        TreeNode node = new TreeNode(values[index]);
        node.left = makeNode(values, 2 * index + 1);
        node.right = makeNode(values, 2 * index + 2);

        return node;
    }

    /**
     * Performs a preorder traversal of the tree.
     */
    public void preorder() {
        System.out.print("Preorder: ");
        preorder(root, 0);
        System.out.println();
    }

    /**
     * Recursive helper method for preorder traversal.
     *
     * @param root the current subtree root
     */
    private void preorder(TreeNode root, int level) {
        if (root == null) return;
        System.out.println();
        for (int i = 0; i < level; i++){
            System.out.print("    ");
        }
        System.out.print(root.value);

        preorder(root.left, level + 1);
        preorder(root.right, level + 1);
    }

    public boolean isMaxHeap(){
        return isMaxHeap(root);
    }

    private boolean isMaxHeap(TreeNode root){
        if (root == null) return true;
        return (
        ((root.left == null  || root.left.value <= root.value) && isMaxHeap(root.left)
        ) && (
            (root.right == null || root.right.value <= root.value) && isMaxHeap(root.right))
        );
    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root, null, null);
    }

    private boolean isBinarySearchTree(TreeNode root, Integer min, Integer max){
        if (root == null) return true;

        if (min != null && root.value <= min) return false;
        if (max !=null && root.value >= max) return false;

        return(
            (isBinarySearchTree(root.left, min, root.value))
            && 
            (isBinarySearchTree(root.right, root.value, max))
        );
    }

    public ArrayList<Integer> inOrderList(){
        ArrayList<Integer> list = new ArrayList<>();
        return inOrderList(root, list);
    }

    private ArrayList<Integer> inOrderList(TreeNode root, ArrayList<Integer> list){

        if (root.value != null) list.add(root.value);
        
        if (root.left != null) inOrderList(root.left ,list);
        if (root.right != null) inOrderList(root.right, list);
        
        Collections.sort(list);
        return list;
    }
}
