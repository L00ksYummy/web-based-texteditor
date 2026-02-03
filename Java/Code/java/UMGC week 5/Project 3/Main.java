import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            //Base Test Case
            Integer[] values = { 90, 70, 50, 20, 40 };
            CompleteBinaryTree tree = new CompleteBinaryTree(values);
            tree.preorder();

            System.out.println("\nNext test case: ");
            CompleteBinaryTree tree2 = new CompleteBinaryTree("100 60 20 40 80");
            tree2.preorder(); 

            System.out.println("\nNext test cast: ");
            System.out.println(tree.isMaxHeap()); //should come up true
            System.out.println(tree2.isMaxHeap()); //should come up false

            System.out.println("\nNext test cast: ");
            System.out.println(tree.isBinarySearchTree()); //should come up false
            CompleteBinaryTree tree3 = new CompleteBinaryTree("100 50 110 30 90 101 120");
            tree3.preorder();
            System.out.println(tree3.isBinarySearchTree()); //should come up true
            CompleteBinaryTree tree4 = new CompleteBinaryTree("100");
            System.out.println(tree4.isBinarySearchTree()); //also should come out true

            System.out.print("\nNextTestCase\n");
            CompleteBinaryTree tree5 = new CompleteBinaryTree("1 20 15 7 81 134 24 8");
            ArrayList<Integer> list = new ArrayList<>(tree5.inOrderList());
            for (int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }



        } catch (InvalidTreeException e) {
            System.out.println(e.getMessage());
        }
    }
}
